
import java.awt.Color;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnGuardar.setxColorBorde(new java.awt.Color(0, 102, 204));
        btnGuardar.setxColorHover(new java.awt.Color(0, 102, 102));
        btnGuardar.setxColorNormal(new java.awt.Color(0, 51, 51));
        btnGuardar.setxColorPresionado(new java.awt.Color(0, 102, 153));
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
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

        btnACTUALIZAR.setxColorBorde(new java.awt.Color(0, 102, 102));
        btnACTUALIZAR.setxColorHover(new java.awt.Color(0, 51, 51));
        btnACTUALIZAR.setxColorNormal(new java.awt.Color(0, 102, 102));
        btnACTUALIZAR.setxColorPresionado(new java.awt.Color(0, 51, 51));
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

        btnBorrar.setxColorBorde(new java.awt.Color(0, 102, 102));
        btnBorrar.setxColorHover(new java.awt.Color(0, 51, 51));
        btnBorrar.setxColorNormal(new java.awt.Color(0, 102, 102));
        btnBorrar.setxColorPresionado(new java.awt.Color(0, 51, 51));
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

        btnNuevo.setxColorBorde(new java.awt.Color(0, 102, 102));
        btnNuevo.setxColorHover(new java.awt.Color(0, 51, 51));
        btnNuevo.setxColorNormal(new java.awt.Color(0, 102, 102));
        btnNuevo.setxColorPresionado(new java.awt.Color(0, 51, 51));
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

        btnPdf.setxColorBorde(new java.awt.Color(0, 102, 102));
        btnPdf.setxColorHover(new java.awt.Color(0, 51, 51));
        btnPdf.setxColorNormal(new java.awt.Color(0, 102, 102));
        btnPdf.setxColorPresionado(new java.awt.Color(0, 51, 51));
        btnPdf.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnPdf.setxTamañoSombra(2);
        btnPdf.setxTexto("PDF");

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

        btnGrafica.setxColorBorde(new java.awt.Color(0, 102, 102));
        btnGrafica.setxColorHover(new java.awt.Color(0, 51, 51));
        btnGrafica.setxColorNormal(new java.awt.Color(0, 102, 102));
        btnGrafica.setxColorPresionado(new java.awt.Color(0, 51, 51));
        btnGrafica.setxColorSombra(new java.awt.Color(204, 204, 204));
        btnGrafica.setxTamañoSombra(2);
        btnGrafica.setxTexto("Grafica");

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
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 375, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private javax.swing.JTable TConsultas;
    private componentes.botonPersonalizado btnACTUALIZAR;
    private componentes.botonPersonalizado btnBorrar;
    private componentes.botonPersonalizado btnCancelar;
    private componentes.botonPersonalizado btnGrafica;
    private componentes.botonPersonalizado btnGuardar;
    private componentes.botonPersonalizado btnNuevo;
    private componentes.botonPersonalizado btnPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnFoto;
    private componentes.textBoxPersonalizado txtClasificacion;
    private componentes.textBoxPersonalizado txtEstreno;
    private componentes.textBoxPersonalizado txtGenero;
    private componentes.textBoxPersonalizado txtId;
    private componentes.textBoxPersonalizado txtPresupuesto;
    private componentes.textBoxPersonalizado txtTitulo;
    // End of variables declaration//GEN-END:variables
}
