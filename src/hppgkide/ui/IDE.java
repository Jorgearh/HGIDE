/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hppgkide.ui;

import java.util.HashMap;

/**
 *
 * @author JorgeAntonio
 */
public class IDE extends javax.swing.JFrame {

    HashMap<String, Documento> documentos;
    
    
    public IDE() {
        initComponents();
        
        documentos = new HashMap<>();
        
        Archivo.documentos = this.documentos;
        Archivo.jtpEditor = this.jtpEditor;
        Archivo.row = this.jlRow;
        Archivo.col = this.jlCol;
        Archivo.crearDirectorios();
        
        Usuario.jmiImportar = this.jmiProyectoImportar;
        Usuario.jmiNuevo = this.jmiProyectoNuevo;
        Usuario.jmiPublicar = this.jmiProyectoPublicar;
        Usuario.jmiLogin = this.jmiUsuarioLogin;
        Usuario.jmiLogout = this.jmiUsuarioLogout;
        Usuario.onLine = false;
        
        Usuario.iniciar(false);
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtArchivo = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jtTraductor = new javax.swing.JToolBar();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtpEditor = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jlRow = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jlCol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmArchivoNuevo = new javax.swing.JMenu();
        jmiArchivoNuevoHaskellpp = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoNuevoGraphiK = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoAbrir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoGuardar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoGuardarComo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoCerrarPestania = new javax.swing.JMenuItem();
        jmProyecto = new javax.swing.JMenu();
        jmiProyectoNuevo = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jmiProyectoImportar = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jmiProyectoPublicar = new javax.swing.JMenuItem();
        jmTraductor = new javax.swing.JMenu();
        jmiTraductorTraducir = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jmTraductorReportes = new javax.swing.JMenu();
        jmiTraductorReportesTablaSimbolos = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jmiTraductorReportesErrores = new javax.swing.JMenuItem();
        jmiUsuario = new javax.swing.JMenu();
        jmiUsuarioLogin = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jmiUsuarioRegistro = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jmiUsuarioLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("H++ & GK");

        jtArchivo.setFloatable(false);
        jtArchivo.setRollover(true);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtArchivo.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtArchivo.add(jButton2);

        jButton3.setText("jButton3");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtArchivo.add(jButton3);

        jButton4.setText("jButton4");
        jtArchivo.add(jButton4);

        jtTraductor.setFloatable(false);
        jtTraductor.setRollover(true);

        jButton5.setText("jButton5");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jtTraductor.add(jButton5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane4)
                    .addComponent(jtpEditor))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jLabel1.setText("Linea:");
        jToolBar3.add(jLabel1);
        jToolBar3.add(jSeparator13);

        jlRow.setText("0");
        jToolBar3.add(jlRow);
        jToolBar3.add(jSeparator12);

        jLabel3.setText("Columna:");
        jToolBar3.add(jLabel3);
        jToolBar3.add(jSeparator14);

        jlCol.setText("0");
        jToolBar3.add(jlCol);

        jmArchivo.setText("Archivo");

        jmArchivoNuevo.setText("Nuevo");

        jmiArchivoNuevoHaskellpp.setText("Haskel++");
        jmiArchivoNuevoHaskellpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoNuevoHaskellppActionPerformed(evt);
            }
        });
        jmArchivoNuevo.add(jmiArchivoNuevoHaskellpp);
        jmArchivoNuevo.add(jSeparator1);

        jmiArchivoNuevoGraphiK.setText("GraphiK");
        jmiArchivoNuevoGraphiK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoNuevoGraphiKActionPerformed(evt);
            }
        });
        jmArchivoNuevo.add(jmiArchivoNuevoGraphiK);

        jmArchivo.add(jmArchivoNuevo);
        jmArchivo.add(jSeparator5);

        jmiArchivoAbrir.setText("Abrir");
        jmiArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoAbrirActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiArchivoAbrir);
        jmArchivo.add(jSeparator2);

        jmiArchivoGuardar.setText("Guardar");
        jmiArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoGuardarActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiArchivoGuardar);
        jmArchivo.add(jSeparator3);

        jmiArchivoGuardarComo.setText("Guardar como");
        jmiArchivoGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoGuardarComoActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiArchivoGuardarComo);
        jmArchivo.add(jSeparator4);

        jmiArchivoCerrarPestania.setText("Cerrar Pestania");
        jmiArchivoCerrarPestania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoCerrarPestaniaActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiArchivoCerrarPestania);

        jMenuBar1.add(jmArchivo);

        jmProyecto.setText("Proyecto");

        jmiProyectoNuevo.setText("Nuevo");
        jmiProyectoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProyectoNuevoActionPerformed(evt);
            }
        });
        jmProyecto.add(jmiProyectoNuevo);
        jmProyecto.add(jSeparator6);

        jmiProyectoImportar.setText("Importar");
        jmiProyectoImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProyectoImportarActionPerformed(evt);
            }
        });
        jmProyecto.add(jmiProyectoImportar);
        jmProyecto.add(jSeparator7);

        jmiProyectoPublicar.setText("Publicar");
        jmiProyectoPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProyectoPublicarActionPerformed(evt);
            }
        });
        jmProyecto.add(jmiProyectoPublicar);

        jMenuBar1.add(jmProyecto);

        jmTraductor.setText("Traductor");

        jmiTraductorTraducir.setText("Traducir");
        jmTraductor.add(jmiTraductorTraducir);
        jmTraductor.add(jSeparator9);

        jmTraductorReportes.setText("Reportes");

        jmiTraductorReportesTablaSimbolos.setText("Tabla de Simbolos");
        jmTraductorReportes.add(jmiTraductorReportesTablaSimbolos);
        jmTraductorReportes.add(jSeparator10);

        jmiTraductorReportesErrores.setText("Errores");
        jmTraductorReportes.add(jmiTraductorReportesErrores);

        jmTraductor.add(jmTraductorReportes);

        jMenuBar1.add(jmTraductor);

        jmiUsuario.setText("Usuario");

        jmiUsuarioLogin.setText("Login");
        jmiUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioLoginActionPerformed(evt);
            }
        });
        jmiUsuario.add(jmiUsuarioLogin);
        jmiUsuario.add(jSeparator8);

        jmiUsuarioRegistro.setText("Registro");
        jmiUsuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioRegistroActionPerformed(evt);
            }
        });
        jmiUsuario.add(jmiUsuarioRegistro);
        jmiUsuario.add(jSeparator11);

        jmiUsuarioLogout.setText("Logout");
        jmiUsuarioLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioLogoutActionPerformed(evt);
            }
        });
        jmiUsuario.add(jmiUsuarioLogout);

        jMenuBar1.add(jmiUsuario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtTraductor, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTraductor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiArchivoNuevoHaskellppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoNuevoHaskellppActionPerformed
        Archivo.archivoNuevo(UI.HASKELL);
    }//GEN-LAST:event_jmiArchivoNuevoHaskellppActionPerformed

    private void jmiArchivoNuevoGraphiKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoNuevoGraphiKActionPerformed
        Archivo.archivoNuevo(UI.GRAPHIK);
    }//GEN-LAST:event_jmiArchivoNuevoGraphiKActionPerformed

    private void jmiArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoAbrirActionPerformed
        Archivo.archivoAbrir();
    }//GEN-LAST:event_jmiArchivoAbrirActionPerformed

    private void jmiArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoGuardarActionPerformed
        Archivo.guardar();
    }//GEN-LAST:event_jmiArchivoGuardarActionPerformed

    private void jmiArchivoGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoGuardarComoActionPerformed
        Archivo.guardarComo();
    }//GEN-LAST:event_jmiArchivoGuardarComoActionPerformed

    private void jmiArchivoCerrarPestaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoCerrarPestaniaActionPerformed
        Archivo.cerrarPestania();
    }//GEN-LAST:event_jmiArchivoCerrarPestaniaActionPerformed

    private void jmiUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioLoginActionPerformed
        Usuario.login();
    }//GEN-LAST:event_jmiUsuarioLoginActionPerformed

    private void jmiProyectoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProyectoNuevoActionPerformed
        Proyecto.nuevo();
    }//GEN-LAST:event_jmiProyectoNuevoActionPerformed

    private void jmiProyectoImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProyectoImportarActionPerformed
        Proyecto.importar();
    }//GEN-LAST:event_jmiProyectoImportarActionPerformed

    private void jmiProyectoPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProyectoPublicarActionPerformed
        Proyecto.publicar();
    }//GEN-LAST:event_jmiProyectoPublicarActionPerformed

    private void jmiUsuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioRegistroActionPerformed
        Usuario.registro();
    }//GEN-LAST:event_jmiUsuarioRegistroActionPerformed

    private void jmiUsuarioLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioLogoutActionPerformed
        Usuario.logout();
    }//GEN-LAST:event_jmiUsuarioLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel jlCol;
    private javax.swing.JLabel jlRow;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmArchivoNuevo;
    private javax.swing.JMenu jmProyecto;
    private javax.swing.JMenu jmTraductor;
    private javax.swing.JMenu jmTraductorReportes;
    private javax.swing.JMenuItem jmiArchivoAbrir;
    private javax.swing.JMenuItem jmiArchivoCerrarPestania;
    private javax.swing.JMenuItem jmiArchivoGuardar;
    private javax.swing.JMenuItem jmiArchivoGuardarComo;
    private javax.swing.JMenuItem jmiArchivoNuevoGraphiK;
    private javax.swing.JMenuItem jmiArchivoNuevoHaskellpp;
    private javax.swing.JMenuItem jmiProyectoImportar;
    private javax.swing.JMenuItem jmiProyectoNuevo;
    private javax.swing.JMenuItem jmiProyectoPublicar;
    private javax.swing.JMenuItem jmiTraductorReportesErrores;
    private javax.swing.JMenuItem jmiTraductorReportesTablaSimbolos;
    private javax.swing.JMenuItem jmiTraductorTraducir;
    private javax.swing.JMenu jmiUsuario;
    private javax.swing.JMenuItem jmiUsuarioLogin;
    private javax.swing.JMenuItem jmiUsuarioLogout;
    private javax.swing.JMenuItem jmiUsuarioRegistro;
    private javax.swing.JToolBar jtArchivo;
    private javax.swing.JToolBar jtTraductor;
    private javax.swing.JTabbedPane jtpEditor;
    // End of variables declaration//GEN-END:variables
}
