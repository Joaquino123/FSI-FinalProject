
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joaqu
 */
public class FPeliculas extends javax.swing.JFrame {

    String peli = "select * from peliculas order by idpelicula";
    String url = "http://joaquinoworld.shop/mysql.php";
//    String url = "http://if0_39458250.epizy.com/mysql.php";

//    ConexionHR cnx=new ConexionHR(url);
    
    ConexionHR cnx = new ConexionHR(url);
    public FPeliculas() {
        initComponents();
        
        Recursos.redondearPanel(jPanel1, 20);
        Recursos.panelFondo(pnFoto, "/img/corto.jpg");
        
        cnx.entablar(peli, TConsultas);
        
        TConsultas.getTableHeader().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int col = TConsultas.columnAtPoint(evt.getPoint());
                String nombreColumna = TConsultas.getColumnName(col);

                String sql = "SELECT * FROM peliculas ORDER BY " + nombreColumna;
                cnx.entablar(sql, TConsultas);
            }
        });
        
        cnx.seleccionar("select generop from peliculas group by generop", cbGenero);
        cnx.seleccionar("select estreno from peliculas group by estreno", cbEstreno);
        cbGenero.addItem("Todos");
        cbEstreno.addItem("Todos");
    }

    private void clean(){
        txtId.setText("");
        txtPresupuesto.setText("");
        txtEstreno.setText("");
        txtTitulo.setText("");
        txtClasificacion.setText("");
        txtGenero.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtId = new componentes.textBoxPersonalizado();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPresupuesto = new componentes.textBoxPersonalizado();
        jLabel3 = new javax.swing.JLabel();
        txtEstreno = new componentes.textBoxPersonalizado();
        jLabel4 = new javax.swing.JLabel();
        txtTitulo = new componentes.textBoxPersonalizado();
        txtClasificacion = new componentes.textBoxPersonalizado();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGenero = new componentes.textBoxPersonalizado();
        btnGuardar = new componentes.botonPersonalizado();
        btnCancelar = new componentes.botonPersonalizado();
        pnFoto = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnACTUALIZAR = new componentes.botonPersonalizado();
        btnBorrar = new componentes.botonPersonalizado();
        btnNuevo = new componentes.botonPersonalizado();
        btnPdf = new componentes.botonPersonalizado();
        btnGrafica = new componentes.botonPersonalizado();
        bInterpretacion = new componentes.botonPersonalizado();
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        pnGrafica = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbEstreno = new javax.swing.JComboBox<>();
        btnFiltro = new componentes.botonPersonalizado();
        btnTodos = new componentes.botonPersonalizado();
        BtnAgrupar = new componentes.botonPersonalizado();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtId.setxBorderColor(new java.awt.Color(0, 0, 0));
        txtId.setxBorderSize(1);
        txtId.setxPlaceholderColor(new java.awt.Color(102, 102, 102));
        txtId.setxShadowSize(0);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("PRESUPUESTO:");

        txtPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        txtPresupuesto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPresupuesto.setxBorderColor(new java.awt.Color(0, 0, 0));
        txtPresupuesto.setxBorderSize(1);
        txtPresupuesto.setxPlaceholderColor(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("ESTRENO:");

        txtEstreno.setForeground(new java.awt.Color(0, 0, 0));
        txtEstreno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEstreno.setxBorderColor(new java.awt.Color(0, 0, 0));
        txtEstreno.setxBorderSize(1);
        txtEstreno.setxPlaceholderColor(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("TITULO:");

        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitulo.setxBorderColor(new java.awt.Color(0, 0, 0));
        txtTitulo.setxBorderSize(1);
        txtTitulo.setxPlaceholderColor(new java.awt.Color(102, 102, 102));

        txtClasificacion.setForeground(new java.awt.Color(0, 0, 0));
        txtClasificacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtClasificacion.setxBorderColor(new java.awt.Color(0, 0, 0));
        txtClasificacion.setxBorderSize(1);
        txtClasificacion.setxPlaceholderColor(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("CLASIFICACIÓN:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("GENERO:");

        txtGenero.setForeground(new java.awt.Color(0, 0, 0));
        txtGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGenero.setxBorderColor(new java.awt.Color(0, 0, 0));
        txtGenero.setxBorderSize(1);
        txtGenero.setxPlaceholderColor(new java.awt.Color(102, 102, 102));

        btnGuardar.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnGuardar.setxColorHover(new java.awt.Color(0, 102, 204));
        btnGuardar.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnGuardar.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnGuardar.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnGuardar.setxTamañoSombra(2);
        btnGuardar.setxTexto("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        btnCancelar.setxColorBorde(new java.awt.Color(153, 0, 0));
        btnCancelar.setxColorHover(new java.awt.Color(153, 0, 0));
        btnCancelar.setxColorNormal(new java.awt.Color(102, 0, 0));
        btnCancelar.setxColorPresionado(new java.awt.Color(51, 0, 0));
        btnCancelar.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnCancelar.setxTamañoSombra(2);
        btnCancelar.setxTexto("Cancelar");

        javax.swing.GroupLayout btnCancelarLayout = new javax.swing.GroupLayout(btnCancelar);
        btnCancelar.setLayout(btnCancelarLayout);
        btnCancelarLayout.setHorizontalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        btnCancelarLayout.setVerticalGroup(
            btnCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnFotoLayout = new javax.swing.GroupLayout(pnFoto);
        pnFoto.setLayout(pnFotoLayout);
        pnFotoLayout.setHorizontalGroup(
            pnFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        pnFotoLayout.setVerticalGroup(
            pnFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(txtPresupuesto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstreno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));

        btnACTUALIZAR.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnACTUALIZAR.setxColorHover(new java.awt.Color(0, 102, 204));
        btnACTUALIZAR.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnACTUALIZAR.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnACTUALIZAR.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnACTUALIZAR.setxTamañoSombra(2);
        btnACTUALIZAR.setxTexto("Actualizar");
        btnACTUALIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnACTUALIZARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnACTUALIZARLayout = new javax.swing.GroupLayout(btnACTUALIZAR);
        btnACTUALIZAR.setLayout(btnACTUALIZARLayout);
        btnACTUALIZARLayout.setHorizontalGroup(
            btnACTUALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        btnACTUALIZARLayout.setVerticalGroup(
            btnACTUALIZARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnBorrar.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnBorrar.setxColorHover(new java.awt.Color(0, 102, 204));
        btnBorrar.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnBorrar.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnBorrar.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnBorrar.setxTamañoSombra(2);
        btnBorrar.setxTexto("Borrar");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBorrarLayout = new javax.swing.GroupLayout(btnBorrar);
        btnBorrar.setLayout(btnBorrarLayout);
        btnBorrarLayout.setHorizontalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        btnBorrarLayout.setVerticalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnNuevo.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnNuevo.setxColorHover(new java.awt.Color(0, 102, 204));
        btnNuevo.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnNuevo.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnNuevo.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnNuevo.setxTamañoSombra(2);
        btnNuevo.setxTexto("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnPdf.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnPdf.setxColorHover(new java.awt.Color(0, 102, 204));
        btnPdf.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnPdf.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnPdf.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnPdf.setxTamañoSombra(2);
        btnPdf.setxTexto("PDF");
        btnPdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPdfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPdfLayout = new javax.swing.GroupLayout(btnPdf);
        btnPdf.setLayout(btnPdfLayout);
        btnPdfLayout.setHorizontalGroup(
            btnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        btnPdfLayout.setVerticalGroup(
            btnPdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnGrafica.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnGrafica.setxColorHover(new java.awt.Color(0, 102, 204));
        btnGrafica.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnGrafica.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnGrafica.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnGrafica.setxTamañoSombra(2);
        btnGrafica.setxTexto("Grafica");
        btnGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGraficaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnGraficaLayout = new javax.swing.GroupLayout(btnGrafica);
        btnGrafica.setLayout(btnGraficaLayout);
        btnGraficaLayout.setHorizontalGroup(
            btnGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        btnGraficaLayout.setVerticalGroup(
            btnGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        bInterpretacion.setxColorBorde(new java.awt.Color(0, 153, 255));
        bInterpretacion.setxColorHover(new java.awt.Color(0, 102, 204));
        bInterpretacion.setxColorNormal(new java.awt.Color(0, 153, 255));
        bInterpretacion.setxColorPresionado(new java.awt.Color(0, 153, 255));
        bInterpretacion.setxColorSombra(new java.awt.Color(204, 204, 204));
        bInterpretacion.setxTamañoSombra(2);
        bInterpretacion.setxTexto("Interpretacion");
        bInterpretacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bInterpretacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bInterpretacionLayout = new javax.swing.GroupLayout(bInterpretacion);
        bInterpretacion.setLayout(bInterpretacionLayout);
        bInterpretacionLayout.setHorizontalGroup(
            bInterpretacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );
        bInterpretacionLayout.setVerticalGroup(
            bInterpretacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bInterpretacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInterpretacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TConsultasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultas);

        jLabel8.setBackground(new java.awt.Color(245, 245, 245));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PELICULAS");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout pnGraficaLayout = new javax.swing.GroupLayout(pnGrafica);
        pnGrafica.setLayout(pnGraficaLayout);
        pnGraficaLayout.setHorizontalGroup(
            pnGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnGraficaLayout.setVerticalGroup(
            pnGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha estreno");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Filtros");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGenero.setMaximumSize(new java.awt.Dimension(72, 22));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Genero");

        cbEstreno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1980", "1990", "2000", "2010" }));
        cbEstreno.setMaximumSize(new java.awt.Dimension(72, 22));

        btnFiltro.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnFiltro.setxColorHover(new java.awt.Color(0, 102, 204));
        btnFiltro.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnFiltro.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnFiltro.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnFiltro.setxTamañoSombra(2);
        btnFiltro.setxTexto("Filtro");
        btnFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnFiltroLayout = new javax.swing.GroupLayout(btnFiltro);
        btnFiltro.setLayout(btnFiltroLayout);
        btnFiltroLayout.setHorizontalGroup(
            btnFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        btnFiltroLayout.setVerticalGroup(
            btnFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnTodos.setxColorBorde(new java.awt.Color(0, 153, 255));
        btnTodos.setxColorHover(new java.awt.Color(0, 102, 204));
        btnTodos.setxColorNormal(new java.awt.Color(0, 153, 255));
        btnTodos.setxColorPresionado(new java.awt.Color(0, 153, 255));
        btnTodos.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnTodos.setxTamañoSombra(2);
        btnTodos.setxTexto("Todos");
        btnTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTodosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnTodosLayout = new javax.swing.GroupLayout(btnTodos);
        btnTodos.setLayout(btnTodosLayout);
        btnTodosLayout.setHorizontalGroup(
            btnTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        btnTodosLayout.setVerticalGroup(
            btnTodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        BtnAgrupar.setxColorBorde(new java.awt.Color(0, 153, 255));
        BtnAgrupar.setxColorHover(new java.awt.Color(0, 102, 204));
        BtnAgrupar.setxColorNormal(new java.awt.Color(0, 153, 255));
        BtnAgrupar.setxColorPresionado(new java.awt.Color(0, 153, 255));
        BtnAgrupar.setxColorSombra(new java.awt.Color(204, 204, 204));
        BtnAgrupar.setxTamañoSombra(2);
        BtnAgrupar.setxTexto("Agrupar por genero");
        BtnAgrupar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgruparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BtnAgruparLayout = new javax.swing.GroupLayout(BtnAgrupar);
        BtnAgrupar.setLayout(BtnAgruparLayout);
        BtnAgruparLayout.setHorizontalGroup(
            BtnAgruparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BtnAgruparLayout.setVerticalGroup(
            BtnAgruparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnGrafica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnAgrupar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbEstreno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAgrupar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pnGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1381, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        clean();
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnACTUALIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnACTUALIZARMouseClicked
        String idpelicula = txtId.getText();
        String presupuesto = txtPresupuesto.getText();
        String estreno = txtEstreno.getText();
        String titulo = txtTitulo.getText();
        String clasificacion = txtClasificacion.getText();
        String generop = txtGenero.getText();

        String []valores=new String[]{idpelicula,titulo,estreno,presupuesto,clasificacion,generop};
        cnx.actualizar2("peliculas", valores);
        cnx.entablar(peli, TConsultas);
        clean();
    }//GEN-LAST:event_btnACTUALIZARMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        String idpelicula = txtId.getText();
        String presupuesto = txtPresupuesto.getText();
        String estreno = txtEstreno.getText();
        String titulo = txtTitulo.getText();
        String clasificacion = txtClasificacion.getText();
        String generop = txtGenero.getText();

        String []valores=new String[]{idpelicula,titulo,estreno,presupuesto,clasificacion,generop};
        cnx.insertar("peliculas", valores);
        cnx.entablar(peli, TConsultas);
        clean();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void TConsultasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultasMousePressed
       DefaultTableModel datos=(DefaultTableModel)TConsultas.getModel();
       int renSel = TConsultas.getSelectedRow();
       if(renSel>-1){
            String idpelicula = datos.getValueAt(renSel, 0).toString();
            String titulo = datos.getValueAt(renSel, 1).toString();
            String estreno = datos.getValueAt(renSel, 2).toString();
            String presupuesto = datos.getValueAt(renSel, 3).toString();
            String clasificacion = datos.getValueAt(renSel, 4).toString();
            String generop = datos.getValueAt(renSel, 5).toString();

            txtId.setText(idpelicula);
            txtPresupuesto.setText(presupuesto);
            txtEstreno.setText(estreno);
            txtTitulo.setText(titulo);
            txtClasificacion.setText(clasificacion);
            txtGenero.setText(generop);
       }
    }//GEN-LAST:event_TConsultasMousePressed

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        String idpelicula = txtId.getText();
        String presupuesto = txtPresupuesto.getText();
        String estreno = txtEstreno.getText();
        String titulo = txtTitulo.getText();
        String clasificacion = txtClasificacion.getText();
        String generop = txtGenero.getText();

        String []valores=new String[]{idpelicula,titulo,estreno,presupuesto,clasificacion,generop};
        cnx.borrar2("filmacion", "peliculas_idpelicula",idpelicula);
        cnx.borrar3("peliculas", valores);
        cnx.entablar(peli, TConsultas);
        clean();
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnGraficaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraficaMouseClicked
        String consulta
                = "select generop, count(*) from peliculas group by generop";

        GraficaBarras g = new GraficaBarras(cnx);
        // conexionHR es tu instancia de ConexionHR

        g.crearGrafica(
                consulta,
                "Peliculas por género",
                "Género",
                "Cantidad",
                pnGrafica,
                "peliculas"// tu JPanel existente
        );
    }//GEN-LAST:event_btnGraficaMouseClicked

    private void btnPdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPdfMouseClicked
        String id = txtId.getText();
        String query = "SELECT p.titulo AS Titulo, f.personaje AS Personaje, a.nombrea AS 'Nombre del actor', f.pago AS 'Sueldo' FROM filmacion f "
                + "JOIN peliculas p ON p.idpelicula = f.peliculas_idpelicula "
                + "JOIN actores a ON a.idactor = f.actores_idactor WHERE p.idpelicula = '" + id + "' ";
        
        String qNombre = "select titulo from peliculas where idpelicula = '" + id + "'";
        String name = cnx.consultar(qNombre).toString();
        name = name.replace("[", "").replace("]", "");
        cnx.crearPDF("Actores que protagonizan la pelicula de " + name, "",
                query, new float[]{1f, 1f, 1f, 1f}, "promedio_mensual");
        cnx.visualizarPDF("promedio_mensual");
    }//GEN-LAST:event_btnPdfMouseClicked

    private void bInterpretacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInterpretacionMouseClicked
        int opcion=2;
        FFilmacion ff=new FFilmacion(txtId.getText(), opcion);
        ff.setVisible(true);
    }//GEN-LAST:event_bInterpretacionMouseClicked

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        String genero = cbGenero.getSelectedItem().toString();
        String anioEstreno = cbEstreno.getSelectedItem().toString();

        String sql = "SELECT * FROM peliculas";
        ArrayList<String> condiciones = new ArrayList<>();

        if (!genero.equals("Todos")) {
            condiciones.add("generop = '" + genero + "'");
        }

        if (!anioEstreno.equals("Todos")) {
            condiciones.add("YEAR(estreno) = '" + anioEstreno + "'");
        }

        if (!condiciones.isEmpty()) {
            sql += " WHERE " + String.join(" AND ", condiciones);
        }

        cnx.entablar(sql, TConsultas);
    }//GEN-LAST:event_btnFiltroMouseClicked

    private void btnTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseClicked
        cnx.entablar("select * from peliculas", TConsultas);
    }//GEN-LAST:event_btnTodosMouseClicked

    private void BtnAgruparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgruparMouseClicked
        String sql="select * from peliculas group by generop";
        cnx.entablar(sql, TConsultas);
    }//GEN-LAST:event_BtnAgruparMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.botonPersonalizado BtnAgrupar;
    private javax.swing.JTable TConsultas;
    private componentes.botonPersonalizado bInterpretacion;
    private componentes.botonPersonalizado btnACTUALIZAR;
    private componentes.botonPersonalizado btnBorrar;
    private componentes.botonPersonalizado btnCancelar;
    private componentes.botonPersonalizado btnFiltro;
    private componentes.botonPersonalizado btnFiltro1;
    private componentes.botonPersonalizado btnGrafica;
    private componentes.botonPersonalizado btnGuardar;
    private componentes.botonPersonalizado btnNuevo;
    private componentes.botonPersonalizado btnPdf;
    private componentes.botonPersonalizado btnTodos;
    private javax.swing.JComboBox<String> cbEstreno;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnFoto;
    private javax.swing.JPanel pnGrafica;
    private componentes.textBoxPersonalizado txtClasificacion;
    private componentes.textBoxPersonalizado txtEstreno;
    private componentes.textBoxPersonalizado txtGenero;
    private componentes.textBoxPersonalizado txtId;
    private componentes.textBoxPersonalizado txtPresupuesto;
    private componentes.textBoxPersonalizado txtTitulo;
    // End of variables declaration//GEN-END:variables
}
