
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author drlias
 */
public class ConexionHR {

    String url; //URL al archivo mysql.php del servidor

    public ConexionHR() {
    }

    public ConexionHR(String url) {
        this.url = url;
    }

    //=========================================================================
    // <editor-fold defaultstate="collapsed" desc="Funciones Solicitudes a BD">   
    //--------------------------------------------------------------------------
    //-------- Muestra el resultado de una consulta en una JTable
    //--------------------------------------------------------------------------
    public int entablar(String consulta, JTable malla) {

        int correcta = 0;

        String resultado = peticionHttpPost(url, consulta);

        if (resultado != null) {

            String[] lineas = resultado.split("->");

            DefaultTableModel modelo = (DefaultTableModel) malla.getModel();
            //limpiar tabla
            modelo.setColumnCount(0);
            modelo.setRowCount(0);

            //agregar las columnas del resultado con su nombre
            String cols[] = lineas[0].split(",");
            for (String col : cols) {
                modelo.addColumn(col.toUpperCase());
            }

            //agregar renglones con los datos
            for (int k = 1; k < lineas.length; k++) {
                String ren[] = lineas[k].split(",");
                modelo.addRow(ren);
            }

            correcta = 1;
        }

        return correcta;

    }

    //--------------------------------------------------------------------------
    //-------- muestra los datos de un campo en un combobox
    //--------------------------------------------------------------------------
    public int seleccionar(String consulta, JComboBox box) {
        int correcta = 1;
        ArrayList<String> datos = new ArrayList();
        String[] lineas = null;

        try {
            String resultado = peticionHttpPost(url, consulta);
            if (resultado != null) {
                lineas = resultado.split("->");
                for (int k = 1; k < lineas.length; k++) {
                    datos.add(lineas[k]);
                }

                DefaultComboBoxModel cbm = new DefaultComboBoxModel(datos.toArray());
                box.setModel(cbm);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            correcta = 0;
        }
        return correcta;
    }

    //--------------------------------------------------------------------------
    //-------- regresa el valor de una consulta de un solo dato
    //-------- si el resultado es la cadena vacia, significa que la consulta ha
    //-------- regresado una tabla vacia o el código SQL es incorrecto
    //--------------------------------------------------------------------------
    public String obtenerDato(String consulta) {

        String dato = "";

        try {
            String resultado = peticionHttpPost(url, consulta);
            if (resultado != null) {
                String[] lineas = resultado.split("->");
                if (lineas.length > 1) {
                    dato = lineas[1];
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());;
        }

        return dato;
    }

    //--------------------------------------------------------------------------
    //-------- regresa el valor de un campo que coincida con un dato dado
    //-------- supone que el campo regresado por la consulta es único
    //--------------------------------------------------------------------------
    public String buscarDato(String tabla, String columnaDeseada, String campoBuscado, String valorBuscado) {
        String consulta = "SELECT " + columnaDeseada + " FROM " + tabla
                + " WHERE " + campoBuscado + " = '" + valorBuscado + "'";

        String dato = "";

        try {
            String resultado = peticionHttpPost(url, consulta);
            if (resultado != null) {
                String[] lineas = resultado.split("->");
                if (lineas.length > 1) {
                    dato = lineas[1];
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());;
        }

        return dato;
    }

    //--------------------------------------------------------------------------
    //-------- regresa una lista con los registros del resultado de la consulta
    //---------cada registro de la lista es otra lista que contiene los datos del registro
    //--------------------------------------------------------------------------
    public ArrayList<ArrayList<String>> consultar(String consulta) {
        ArrayList<ArrayList<String>> datos = new ArrayList();

        String resultado = peticionHttpPost(url, consulta);

        if (resultado != null) {

            String[] lineas = resultado.split("->");

            for (int idx = 1; idx < lineas.length; idx++) {
                String linea = lineas[idx];
                ArrayList<String> renglon = new ArrayList();
                String[] valores = linea.split(",");
                for (Object elem : valores) {
                    renglon.add(elem.toString());
                }
                datos.add(renglon);
            }

        }

        return datos;
    }

    // </editor-fold>
    //=========================================================================
    // <editor-fold defaultstate="collapsed" desc="Funciones PDF">   
    //-------------------------------------------------
    //Crea un archivo PDF en base a una consulta dada
    //-------------------------------------------------
    public int crearPDF(String titulo, String encabezado, String consulta, float[] anchos, String nombreReporte) {
        int correcta = 0;

        String resultado = peticionHttpPost(url, consulta);

        if (resultado != null) {
            Document doc = new Document();

            String[] lineas = resultado.split("->");

            try {
                PdfWriter.getInstance(doc, new FileOutputStream(nombreReporte + ".pdf"));
                doc.open();

                //Titulo
//                Image image = Image.getInstance("logo.PNG"); //For adding image in the pdf.
//                image.scaleAbsolute(60, 80);
//                image.setAbsolutePosition(490f, 750f);
//                doc.add(image);
                doc.add(new Paragraph(titulo,
                        FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLACK))
                );
                doc.add(new Paragraph(obtenerFechaHoraE()));
                doc.add(Chunk.NEWLINE);
                doc.add(new Paragraph(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - "));
                doc.add(Chunk.NEWLINE);
                doc.add(Chunk.NEWLINE);

                String cols[] = lineas[0].split(",");
                int numCols = cols.length;

                PdfPTable tbl = new PdfPTable(numCols);

                tbl.setTotalWidth(550f);
                tbl.setLockedWidth(true);

                tbl.setHorizontalAlignment(1);
                tbl.setWidths(anchos);
                tbl.setHeaderRows(2);

                //Encabezado de la tabla
                PdfPCell cell = new PdfPCell(new Phrase(encabezado));
                cell.setColspan(numCols);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(new BaseColor(51, 153, 255));
                tbl.addCell(cell);

                //Encabezados de las columnas
                for (String col : cols) {
                    PdfPCell cel = new PdfPCell(new Phrase(col.toUpperCase()));
                    cel.setBackgroundColor(new BaseColor(153, 204, 255));
                    tbl.addCell(cel);
                }

                //Agregar los registros
                for (int k = 1; k < lineas.length; k++) {
                    String ren[] = lineas[k].split(",");
                    for (String valor : ren) {
                        tbl.addCell(valor);
                    }
                }

                doc.add(tbl);
                correcta = 1;

            } catch (Exception ex) {
                System.out.println("Error al generar: " + ex.getMessage());
                correcta = 0;
            }

            doc.close();
        }

        return correcta;
    }

    //-----------------------------------------------
    //Visualizar un archivo pdf
    //-----------------------------------------------
    public void visualizarPDF(String archivo) {
        try {
            File path = new File(archivo + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // </editor-fold> 
    //=========================================================================
    // <editor-fold defaultstate="collapsed" desc="Funciones de fechas">   
    //========================================================================
    //--------------------------------------------------------------------------
    //-------- obtener la fechay hora del sistema
    //--------------------------------------------------------------------------
    public String obtenerFechaHora() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);
        int mSecond = c.get(Calendar.SECOND);
        int mMili = c.get(Calendar.MILLISECOND);

        return year + "-" + month + "-" + day + " " + mHour + ":" + mMinute + ":" + mSecond + "." + mMili;
    }

    //--------------------------------------------------------------------------
    //-------- Convertir fecha util a fehca 
    //--------------------------------------------------------------------------
    public String toSQL(java.util.Date fecha) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(fecha);
    }

    //========================================================================
    //--------------------------------------------------------------------------
    //-------- obtener la fechay hora del sistema
    //--------------------------------------------------------------------------
    public String obtenerFechaHoraE() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);
        int mSecond = c.get(Calendar.SECOND);
        int mMili = c.get(Calendar.MILLISECOND);

        return day + "/" + month + "/" + year + " " + mHour + ":" + mMinute + ":" + mSecond;
    }
//========================================================================
    //--------------------------------------------------------------------------
    //-------- convertir fecha sql a fecha util
    //--------------------------------------------------------------------------

    public java.util.Date toDate(String fecha) {
        String partes[] = fecha.split("-");
        int yy = Integer.parseInt(partes[0]);
        int nn = Integer.parseInt(partes[1]);
        int dd = Integer.parseInt(partes[2]);

        return new java.util.Date(yy, nn, dd);
    }

    //--------------------------------------------------------------------------
    //-------- obtener la fecha del sistema
    //--------------------------------------------------------------------------
    public String obtenerFecha() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);

        return year + "-" + month + "-" + day;
    }

    //--------------------------------------------------------------------------
    //-------- obtener la hora del sistema
    //--------------------------------------------------------------------------
    public String obtenerHora() {
        Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);
        int mSecond = c.get(Calendar.SECOND);
        int mMili = c.get(Calendar.MILLISECOND);

        return mHour + ":" + mMinute + ":" + mSecond + "." + mMili;
    }

    // </editor-fold> 
    //=========================================================================
    // <editor-fold defaultstate="collapsed" desc="Funciones para peticiones">   
    public String peticionHttpPost(String url_visitar, String query) {
        try {

            URL urlv = new URL(url_visitar);

            Map<String, Object> params = new LinkedHashMap();
            params.put("key", "secret");
            params.put("query", query);

            StringBuilder postdata = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postdata.length() != 0) {
                    postdata.append("&");
                }
                postdata.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postdata.append("=");
                postdata.append(URLEncoder.encode(param.getValue().toString(), "UTF-8"));
            }

            byte[] postbytes = postdata.toString().getBytes("UTF-8");

            HttpURLConnection con = (HttpURLConnection) urlv.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("Content-Length", "" + postbytes.length);
            con.setDoOutput(true);
            con.getOutputStream().write(postbytes);

            //------------
            BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            StringBuilder resultado = new StringBuilder();
            while ((linea = rd.readLine()) != null) {
                if (resultado.length() != 0) {
                    resultado.append("->");
                }
                resultado.append(linea);
            }
            rd.close();
            return resultado + "";

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }

    //-----------------------
    public static String peticionHttpGet(String url) throws Exception {
        // Esto es lo que vamos a devolver
        StringBuilder resultado = new StringBuilder();
        // Crear un objeto de tipo URL
        URL urlv = new URL(url);

        // Abrir la conexión e indicar que será de tipo GET
        HttpURLConnection conexion = (HttpURLConnection) urlv.openConnection();
        conexion.setRequestMethod("GET");
        // Búferes para leer
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        // Mientras el BufferedReader se pueda leer, agregar contenido a resultado
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }
        // Cerrar el BufferedReader
        rd.close();
        // Regresar resultado, pero como cadena, no como StringBuilder
        return resultado.toString();
    }
    // </editor-fold> 

    //=========================================================================
    //-------------------------------------------------------
    //---Obtiene los nombres de las columnas de una tabla
    //-------------------------------------------------------
    public String[] columnas(String tabla) {
        String consulta = "SELECT * FROM " + tabla;
        String[] columnas = null;
        try {
            String resultado = peticionHttpPost(url, consulta);
            if (resultado != null) {
                String[] lineas = resultado.split("->");
                columnas = lineas[0].split(",");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return columnas;
    }

    //-------------------------------------------------------
    //---Insertar un registro en una tabla
    //-------------------------------------------------------
    public int insertar(String tabla, String[] valores) {
        int correcta = 0;

        String sql = "INSERT INTO " + tabla + " VALUES(";
        for (int k = 0; k < valores.length; k++) {
            if (valores[k].equals("")) {
                sql += "NULL";
            } else {
                sql += "'" + valores[k] + "'";
            }
            if (k < valores.length - 1) {
                sql += ",";
            }
        }
        sql += ")";

        System.out.println("INSERTAR: " + sql);

        try {
            String resultado = peticionHttpPost(url, sql);
            if (resultado.contains("AFFECTED ROWS")) {
                correcta = 1;
            }
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return correcta;
    }

    //-------------------------------------------------------
    //---Actualizar un registro en una tabla
    //-------------------------------------------------------
    public int actualizar2(String tabla, String[] valores) {
        int correcta = 0;
        String[] cols = columnas(tabla);

        StringBuilder sql = new StringBuilder("UPDATE ").append(tabla).append(" SET ");
        for (int k = 1; k < valores.length; k++) {
            sql.append(cols[k]).append(" = '").append(valores[k].replace("'", "''")).append("'");
            if (k < valores.length - 1) {
                sql.append(", ");
            }
        }
        sql.append(" WHERE ").append(cols[0]).append(" = '").append(valores[0]).append("'");

        System.out.println("ACTUALIZAR: " + sql.toString());

        try {
            // <<< PASAR SOLO EL SQL CRUDO >>
            String resultado = peticionHttpPost(url, sql.toString());

            if (resultado != null && resultado.contains("AFFECTED ROWS")) {
                correcta = 1;
            } else {
                System.out.println("Resultado: " + resultado);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return correcta;
    }

    public int actualizarClaveCompuesta(String tabla, String[] valores) {
        int correcta = 0;
        String[] cols = columnas(tabla);

        // <<< NÚMERO DE COLUMNAS QUE SON PARTE DE LA PK >>>
        int numPK = 2;   // ⚠ CAMBIA ESTO si tu tabla tiene 3 PKs

        StringBuilder sql = new StringBuilder("UPDATE ").append(tabla).append(" SET ");

        // Construimos el SET (los valores que se actualizan)
        for (int k = numPK; k < valores.length; k++) {
            sql.append(cols[k]).append(" = '")
                    .append(valores[k].replace("'", "''")).append("'");
            if (k < valores.length - 1) {
                sql.append(", ");
            }
        }

        // WHERE para clave compuesta
        sql.append(" WHERE ");
        for (int i = 0; i < numPK; i++) {
            sql.append(cols[i]).append(" = '")
                    .append(valores[i].replace("'", "''")).append("'");
            if (i < numPK - 1) {
                sql.append(" AND ");
            }
        }

        System.out.println("ACTUALIZAR: " + sql.toString());

        try {
            String resultado = peticionHttpPost(url, sql.toString());

            if (resultado != null && resultado.contains("AFFECTED ROWS")) {
                correcta = 1;
            } else {
                System.out.println("Resultado: " + resultado);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return correcta;
    }

    //-------------------------------------------------------
    //---Borra el registro en una tabla
    //-------------------------------------------------------
    public int borrar2(String tabla, String columna, String valores) {
        int correcta = 0;

        String sql = "DELETE FROM " + tabla
                + " WHERE " + columna + " = " + "'"+valores+"'";

        try {
            String resultado = peticionHttpPost(url, sql);
            if (resultado.contains("AFFECTED ROWS")) {
                correcta = 1;
            }
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return correcta;
    }
    public int borrar3(String tabla, String[] valores) {
        int correcta = 0;

        String[] cols = columnas(tabla);
        String idVal = (valores[0] == null) ? "" : valores[0].replace("'", "''");
        String sql = "DELETE FROM " + tabla + " WHERE " + cols[0] + " = '" + idVal + "'";

        try {
            System.out.println("SQL a enviar: " + sql);
            String resultado = peticionHttpPost2(url, sql); // tu función que hace POST

            if (resultado != null) {
                System.out.println("Respuesta del servidor: " + resultado);

                // 1) Si PHP devuelve "AFFECTED ROWS" simple
                if (resultado.contains("AFFECTED ROWS") && !resultado.matches(".*\\d.*")) {
                    correcta = 1;
                }

                // 2) Si PHP devuelve "AFFECTED ROWS: N" parseamos N
                Matcher m = Pattern.compile("AFFECTED ROWS\\s*[:]?\\s*(\\d+)", Pattern.CASE_INSENSITIVE)
                        .matcher(resultado);
                if (m.find()) {
                    int filas = Integer.parseInt(m.group(1));
                    if (filas > 0) {
                        correcta = 1; // si quieres devolver el número, puedes retornarlo
                    }
                    System.out.println("Filas afectadas: " + filas);
                }

                // 3) Si el resultado contiene ERROR de MySQL, imprimirlo
                if (resultado.toUpperCase().contains("ERROR") || resultado.toUpperCase().contains("WRONG SQL")) {
                    System.out.println("Error del servidor: " + resultado);
                }
            } else {
                System.out.println("Respuesta del servidor (o null): " + resultado);
            }
        } catch (Exception e) {
            System.out.println("Excepción en borrar(): " + e.getMessage());
        }

        return correcta;
    }

    public int borrarClaveCompuesta(String tabla, String[] valores) {
        int correcta = 0;

        String[] cols = columnas(tabla);

        // <<< NUMERO DE COLUMNAS QUE SON PARTE DE LA PK >>>
        int numPK = 2;

        // Armamos DELETE
        StringBuilder sql = new StringBuilder("DELETE FROM ").append(tabla).append(" WHERE ");

        for (int i = 0; i < numPK; i++) {
            String valor = (valores[i] == null) ? "" : valores[i].replace("'", "''");
            sql.append(cols[i]).append(" = '").append(valor).append("'");

            if (i < numPK - 1) {
                sql.append(" AND ");
            }
        }

        System.out.println("SQL a enviar: " + sql.toString());

        try {
            String resultado = peticionHttpPost2(url, sql.toString());

            if (resultado != null) {
                System.out.println("Respuesta del servidor: " + resultado);

                // Detectar AFFECTED ROWS
                Matcher m = Pattern.compile("AFFECTED ROWS\\s*[:]?\\s*(\\d+)", Pattern.CASE_INSENSITIVE)
                        .matcher(resultado);
                if (m.find()) {
                    int filas = Integer.parseInt(m.group(1));
                    if (filas > 0) {
                        correcta = 1;
                    }
                }

                if (resultado.toUpperCase().contains("ERROR")) {
                    System.out.println("Error SQL: " + resultado);
                }

            }

        } catch (Exception e) {
            System.out.println("Error en borrar3: " + e.getMessage());
        }

        return correcta;
    }

    private String peticionHttpPost2(String urlStr, String query) {
        try {
            String key = "secret";

            String parametros = "key=" + URLEncoder.encode(key, "UTF-8")
                    + "&query=" + URLEncoder.encode(query, "UTF-8");

            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Charset", "UTF-8");

            // Enviar los parámetros
            try (OutputStream os = conn.getOutputStream()) {
                os.write(parametros.getBytes(StandardCharsets.UTF_8));
            }

            int respuesta = conn.getResponseCode();
            System.out.println("HTTP CODE: " + respuesta);

            InputStream is;

            // Si es 200 o 201 → leer input normal
            if (respuesta >= 200 && respuesta < 300) {
                is = conn.getInputStream();
            } else {
                // En errores Webcindario usa errorStream
                is = conn.getErrorStream();
                if (is == null) {
                    return null;
                }
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            String linea;

            while ((linea = br.readLine()) != null) {
                sb.append(linea);
            }

            return sb.toString();

        } catch (Exception e) {
            System.out.println("Error en peticionHttpPost(): " + e.getMessage());
            return null;
        }
    }

    public static void styleTable(JTable table,
            Color headerBg,
            Color headerFg,
            Color rowBg,
            Color rowAltBg,
            Color rowFg,
            Color selectionBg,
            int rowHeight,
            Font headerFont,
            Font rowFont) {

        // --- Encabezado ---
        JTableHeader header = table.getTableHeader();
        header.setBackground(headerBg);
        header.setForeground(headerFg);
        header.setFont(headerFont);
        header.setOpaque(true);

        // Quita bordes feos del header
        header.setBorder(BorderFactory.createEmptyBorder());

        // --- Filas ---
        table.setRowHeight(rowHeight);
        table.setFont(rowFont);
        table.setForeground(rowFg);

        // Renderer personalizado para colores de filas
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable tbl, Object val,
                    boolean isSelected, boolean hasFocus,
                    int row, int col) {

                Component c = super.getTableCellRendererComponent(tbl, val, isSelected, hasFocus, row, col);

                if (isSelected) {
                    c.setBackground(selectionBg);
                    c.setForeground(Color.WHITE);
                } else {
                    c.setBackground(row % 2 == 0 ? rowBg : rowAltBg);
                    c.setForeground(rowFg);
                }

                setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
                return c;
            }
        });

        // Quitar líneas de celda (opcional)
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);

        // Bordes suaves
        table.setIntercellSpacing(new Dimension(0, 0));
    }
    
}
