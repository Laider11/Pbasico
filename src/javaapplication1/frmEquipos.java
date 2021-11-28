/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import javax.swing.DefaultListModel;

/**
 *
 * @author Laider
 */
public class frmEquipos extends javax.swing.JFrame {
    DefaultListModel modeloEquipos=new DefaultListModel();
    DefaultListModel modeloA=new DefaultListModel();
    DefaultListModel modeloB=new DefaultListModel();
    /**
     * Creates new form frmEquipos
     */
    public frmEquipos() {
        initComponents();
        //adicionar equipos al modelo equipos
        modeloEquipos.addElement("Academia Cantolao");
    modeloEquipos.addElement("Alianza Atlético");
    modeloEquipos.addElement("Alianza Lima");
    modeloEquipos.addElement("Alianza Universidad");
    modeloEquipos.addElement("Ayacucho FC");
    modeloEquipos.addElement("Carlos A. Mannucci");
    modeloEquipos.addElement("Cienciano");
    modeloEquipos.addElement("Cusco FC");
    modeloEquipos.addElement("Deportivo Binacional");
    modeloEquipos.addElement("Deportivo Municipal");
    modeloEquipos.addElement("FBC Melgar");
    modeloEquipos.addElement("Sport Boys");
    modeloEquipos.addElement("Sport Huancayo");
    modeloEquipos.addElement("Sporting Cristal");
    modeloEquipos.addElement("Universidad César Vallejo");
    modeloEquipos.addElement("Universidad San Martín");
    modeloEquipos.addElement("UTC");
    modeloEquipos.addElement("Universitario");

        //VINCULAR
        lstEquipos.setModel(modeloEquipos);
        lstGrupoA.setModel(modeloA);
        lstGrupoB.setModel(modeloB);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboGrupo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEquipos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstGrupoA = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstGrupoB = new javax.swing.JList<>();
        btnEnviarDerecha = new javax.swing.JButton();
        btnEnviarIzquierda = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Grupo:");

        jLabel2.setText("Seleccione Equipo");

        cboGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        jScrollPane1.setViewportView(lstEquipos);

        jLabel3.setText("Grupo A");

        jLabel4.setText("Grupo B");

        jScrollPane2.setViewportView(lstGrupoA);

        jScrollPane3.setViewportView(lstGrupoB);

        btnEnviarDerecha.setText(">");
        btnEnviarDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarDerechaActionPerformed(evt);
            }
        });

        btnEnviarIzquierda.setText("<");
        btnEnviarIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarIzquierdaActionPerformed(evt);
            }
        });

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEnviarDerecha)
                                    .addComponent(btnEnviarIzquierda)))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnProcesar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btnEnviarDerecha)
                                .addGap(30, 30, 30)
                                .addComponent(btnEnviarIzquierda)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnProcesar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
//variables
    int posGrupo;
    String nombreEquipo;
    //obtener posición del grupo seleccionado del combo
    posGrupo=cboGrupo.getSelectedIndex();
    //obtener el nombre del equipo seleccionado del control lstEquipos
    nombreEquipo=lstEquipos.getSelectedValue();
    //validar posGrupo
    if(posGrupo==0){
    modeloA.addElement(nombreEquipo);
    modeloEquipos.removeElement(nombreEquipo);
    }
    else{
    modeloB.addElement(nombreEquipo);
    modeloEquipos.removeElement(nombreEquipo);
    }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnEnviarIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarIzquierdaActionPerformed
        //variable
        String nomEquipo;
        nomEquipo=lstGrupoB.getSelectedValue();
        modeloA.addElement(nomEquipo);
        modeloB.removeElement(nomEquipo);
               
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarIzquierdaActionPerformed

    private void btnEnviarDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarDerechaActionPerformed
        String nomEquipo;
        nomEquipo=lstGrupoA.getSelectedValue();
        modeloB.addElement(nomEquipo);
        modeloA.removeElement(nomEquipo);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarDerechaActionPerformed

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
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarDerecha;
    private javax.swing.JButton btnEnviarIzquierda;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstEquipos;
    private javax.swing.JList<String> lstGrupoA;
    private javax.swing.JList<String> lstGrupoB;
    // End of variables declaration//GEN-END:variables
}