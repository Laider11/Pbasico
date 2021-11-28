/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Laider
 */
public class frmInstituto extends javax.swing.JFrame {

    /**
     * Creates new form frmInstituto
     */
    public frmInstituto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbtnNombrado = new javax.swing.JRadioButton();
        rbtnContratado = new javax.swing.JRadioButton();
        rbtnCas = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        chkAfp = new javax.swing.JCheckBox();
        chkSparticular = new javax.swing.JCheckBox();
        chkSvehiculasr = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instituto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sueldo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setText("Empleado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        txtSueldo.setEditable(false);
        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 30));
        getContentPane().add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, 30));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Condición Laboral")));

        grupo1.add(rbtnNombrado);
        rbtnNombrado.setText("Nombrado");

        grupo1.add(rbtnContratado);
        rbtnContratado.setText("Contratado");

        grupo1.add(rbtnCas);
        rbtnCas.setText("CAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNombrado)
                    .addComponent(rbtnContratado)
                    .addComponent(rbtnCas))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbtnNombrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnContratado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnCas)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Otros Gastos"));

        chkAfp.setText("AFP 11%");

        chkSparticular.setText("Seguro Particular 12%");

        chkSvehiculasr.setText("Seguro Vehicular 8%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAfp)
                    .addComponent(chkSparticular)
                    .addComponent(chkSvehiculasr))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(chkAfp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSparticular)
                .addGap(3, 3, 3)
                .addComponent(chkSvehiculasr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 170, 100));

        txtS.setColumns(20);
        txtS.setRows(5);
        jScrollPane1.setViewportView(txtS);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 510, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    String empleado,cLaboral=("");
    double incentivo=0.0,sueldo=0.0,afp=0.0,sParticular=0.0,sVehicular=0.0,tGasto=0.0,tPagar=0.0;
    txtS.setText("");
   //entrada
   
    //proceso
        if (rbtnNombrado.isSelected()) {
            incentivo=350;
            cLaboral="Nombrado";
            txtSueldo.setText(""+incentivo+"");
        }
            else if (rbtnContratado.isSelected()) {
                    incentivo=240;
                    cLaboral="Contratado";
                    txtSueldo.setText(""+incentivo+"");
            }
                    else if (rbtnCas.isSelected()) {
                    incentivo=180;
                    cLaboral="CAS";
                    txtSueldo.setText(""+incentivo+"");
                }
        sueldo=Double.parseDouble(txtSueldo.getText());
       
   //otros gastos
   
   if(chkAfp.isSelected())
    afp=sueldo*0.11;
    if(chkSparticular.isSelected())
    sParticular=sueldo*0.12;
    if(chkSvehiculasr.isSelected())
    sVehicular=sueldo*0.08;
    
    //operación
    tGasto=afp+sParticular+sVehicular;
    tPagar=sueldo-tGasto;
    //salida
    empleado = txtEmpleado.getText();
   
    txtS.append("Empleado : "+empleado+"\n");
    txtS.append("Incentivo : "+incentivo+"\n");
    txtS.append("Condición Laboral : "+cLaboral+"\n");
    txtS.append("AFP : "+afp+"\n");
    txtS.append("Seguro Particular : "+sParticular+"\n");
    txtS.append("Seguro Vehicular : "+sVehicular+"\n");
    txtS.append("Total Gasto : "+tGasto+"\n");
    txtS.append("Total Pagar : "+tPagar+"\n");
   
    // TODO add your handling code here:
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmInstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInstituto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkAfp;
    private javax.swing.JCheckBox chkSparticular;
    private javax.swing.JCheckBox chkSvehiculasr;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCas;
    private javax.swing.JRadioButton rbtnContratado;
    private javax.swing.JRadioButton rbtnNombrado;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextArea txtS;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
