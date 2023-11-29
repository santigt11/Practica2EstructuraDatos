/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Archivos.VentaArchivos;
import controlador.TDA.listas.Exception.EmptyException;
import controlador.VentaControl;
import javax.swing.JOptionPane;
import modelo.Casa;
import modelo.Vendedor;
import vista.listas.tablas.ModeloTablaVenta;

/**
 *
 * @author santi
 */
public class FrmRegistrarVenta extends javax.swing.JFrame {

    private static VentaControl ventaControl = new VentaControl();
    private ModeloTablaVenta mtp = new ModeloTablaVenta();
    private VentaArchivos va  = new VentaArchivos();

    public static void cargarCasa(Casa casa) {
        ventaControl.getVenta().setCasa(casa);
        lblCasa.setText(casa.getDireccion());
    }

    public static void cargarVendedor(Vendedor vendedor) {
        ventaControl.getVenta().setVendedor(vendedor);
        lblVendedor.setText(vendedor.getApellidos());
    }

    private void limpiar() {
        lblCasa.setText("");
        lblVendedor.setText("");
        ventaControl.setVenta(null);
        cargarTabla();
    }

    private void cargarTabla() {
        mtp.setVentas(va.all());
        ventaControl.setVentas(va.all());
        tbVenta.setModel(mtp);
        tbVenta.updateUI();
    }

    private void guardar() throws EmptyException {
        if (ventaControl.guardar()) {
            va.persist(ventaControl.getVenta());
            JOptionPane.showMessageDialog(null, "Datos guardados");
            System.out.println(ventaControl.getVenta().getId());
            cargarTabla();
            System.out.println(ventaControl.getVenta().getCasa().getTipoCasa());
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo guardar, hubo un error");
        }
    }
    
    private void cargarVista() {
        int fila = tbVenta.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Escoja un registro de la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ventaControl.setVenta(mtp.getVentas().getInfo(fila));
                lblCasa.setText(ventaControl.getVenta().getCasa().getDireccion());
                lblVendedor.setText(ventaControl.getVenta().getVendedor().getApellidos());
            } catch (Exception ex) {
                ex.toString();
            }
        }
    }
    
    /**
     * Creates new form FrmRegistrarVenta
     */
    public FrmRegistrarVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVenta = new javax.swing.JTable();
        btSeleccionarCasa = new javax.swing.JButton();
        btSeleccionarVendedor = new javax.swing.JButton();
        lblVendedor = new javax.swing.JLabel();
        lblCasa = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();
        btQuitarSeleccion = new javax.swing.JButton();
        btAtras3 = new javax.swing.JButton();

        btAtras.setText("ATRAS");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("VENDEDOR:");

        jLabel1.setText("REGISTRAR VENTAS");

        jLabel2.setText("CASA");

        btGuardar.setText("GUARDAR");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        tbVenta.setModel(new javax.swing.table.DefaultTableModel(
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
        tbVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVenta);

        btSeleccionarCasa.setText("SELECCIONAR");
        btSeleccionarCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarCasaActionPerformed(evt);
            }
        });

        btSeleccionarVendedor.setText("SELECCIONAR");
        btSeleccionarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarVendedorActionPerformed(evt);
            }
        });

        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btQuitarSeleccion.setText("QUITAR SELECCION");
        btQuitarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuitarSeleccionActionPerformed(evt);
            }
        });

        btAtras3.setText("ATRAS");
        btAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtras3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btQuitarSeleccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAtras3))
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btGuardar)
                                        .addGap(127, 127, 127))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(77, 77, 77)
                                        .addComponent(btSeleccionarCasa))
                                    .addComponent(btSeleccionarVendedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btModificar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btSeleccionarCasa)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSeleccionarVendedor)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btModificar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btQuitarSeleccion)
                    .addComponent(btAtras3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        try {
            guardar();
        } catch (EmptyException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void tbVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVentaMouseClicked
        cargarVista();
    }//GEN-LAST:event_tbVentaMouseClicked

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        if (tbVenta.getSelectedRow() >= 0) {
            va.merge(ventaControl.getVenta(), tbVenta.getSelectedRow());
            cargarTabla();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor seleccione el objeto que desea modificar");
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
        this.setVisible(false);
        new FrmPrincipal().setVisible(true);
    }//GEN-LAST:event_btAtrasActionPerformed

    private void btSeleccionarCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarCasaActionPerformed
        new DlListaCasas(null, true).setVisible(true);
    }//GEN-LAST:event_btSeleccionarCasaActionPerformed

    private void btSeleccionarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarVendedorActionPerformed
        new DlListasVendedores(null, true).setVisible(true);
    }//GEN-LAST:event_btSeleccionarVendedorActionPerformed

    private void btQuitarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuitarSeleccionActionPerformed
        limpiar();
    }//GEN-LAST:event_btQuitarSeleccionActionPerformed

    private void btAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtras3ActionPerformed
        this.setVisible(false);
        new FrmPrincipal().setVisible(true);
    }//GEN-LAST:event_btAtras3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistrarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistrarVenta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistrarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtras;
    private javax.swing.JButton btAtras3;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btQuitarSeleccion;
    private javax.swing.JButton btSeleccionarCasa;
    private javax.swing.JButton btSeleccionarVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lblCasa;
    private static javax.swing.JLabel lblVendedor;
    private javax.swing.JTable tbVenta;
    // End of variables declaration//GEN-END:variables
}
