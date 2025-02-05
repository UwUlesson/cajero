/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

/**
 *
 * @author estudiantes
 */
public class impresion extends javax.swing.JFrame {

    /**
     * Creates new form impresion
     */
    public impresion() {
        initComponents();
        setLocationRelativeTo(null);
        MosDat();
    }
    
    
    private void MosDat(){
        captura cap = new captura();
        if(cap.GetCap()){
            DatNec();
            DatOpc();
            
        }else{
            DatNec();
            OcultDatOpc();
            
        }
        
    };
    
    private void DatNec(){
        IdPrestamo id = new IdPrestamo(); 
        prestamo pres = new prestamo();
        PrestamoNew Npres = new PrestamoNew();
        this.Numero.setText(id.getIden()+"-"+pres.GetfechaForm()+"-"+pres.GetCont());
        this.Id.setText(id.getIden());
        this.CantPres.setText(Integer.toString(pres.GetValText()));
        this.PresTot.setText(Integer.toString(Npres.GetVal()));
        
    }
    
    private void DatOpc(){
        IdPrestamo id = new IdPrestamo(); 
        prestamo pres = new prestamo();
        PrestamoNew Npres = new PrestamoNew();
        this.NomPres.setText(id.getPrimNom());
        this.ApellPres.setText(id.getPrimApell()+" "+id.getSeguApell());
        this.TelCasa.setText(id.getTeleCasa());
        this.TelMovil.setText(id.getTeleMovil());
        
    }
    
    private void OcultDatOpc(){
        IdPrestamo id = new IdPrestamo(); 
        prestamo pres = new prestamo();
        PrestamoNew Npres = new PrestamoNew();
        this.NomPres.setText("");
        this.ApellPres.setText("");
        this.TelCasa.setText("");
        this.TelMovil.setText("");
        this.opcional1.setText("");
        this.opcional2.setText("");
        this.opcional3.setText("");
        this.opcional4.setText("");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CantPres = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PresTot = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        opcional1 = new javax.swing.JLabel();
        opcional2 = new javax.swing.JLabel();
        opcional3 = new javax.swing.JLabel();
        opcional4 = new javax.swing.JLabel();
        NomPres = new javax.swing.JLabel();
        ApellPres = new javax.swing.JLabel();
        TelCasa = new javax.swing.JLabel();
        TelMovil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Datos del Prestamo");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero Prestamo");

        Numero.setText("Numero");

        jLabel3.setText("Cantidad Prestamo");

        CantPres.setText("CantPres");

        jLabel4.setText("Prestamos totales");

        PresTot.setText("PresTot");

        jLabel5.setText("Id prestamista");

        Id.setText("Id");

        opcional1.setText("Nombre prestamista");

        opcional2.setText("apellidos prestamista");

        opcional3.setText("Telefono Casa");

        opcional4.setText("Telefono Movil");

        NomPres.setText("NomPres");

        ApellPres.setText("ApellPres");

        TelCasa.setText("TelCasa");

        TelMovil.setText("TelMovil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CantPres)
                                    .addComponent(PresTot))
                                .addGap(264, 264, 264)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelCasa)
                                    .addComponent(TelMovil)
                                    .addComponent(ApellPres)
                                    .addComponent(NomPres)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcional4)
                                    .addComponent(opcional3)
                                    .addComponent(opcional2)
                                    .addComponent(opcional1))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id)
                            .addComponent(Numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(opcional1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero)
                    .addComponent(NomPres))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(opcional2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id)
                    .addComponent(ApellPres))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(opcional3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantPres)
                    .addComponent(TelCasa))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opcional4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PresTot)
                    .addComponent(TelMovil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Opciones opt = new Opciones();
        opt.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new impresion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApellPres;
    private javax.swing.JLabel CantPres;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel NomPres;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel PresTot;
    private javax.swing.JLabel TelCasa;
    private javax.swing.JLabel TelMovil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel opcional1;
    private javax.swing.JLabel opcional2;
    private javax.swing.JLabel opcional3;
    private javax.swing.JLabel opcional4;
    // End of variables declaration//GEN-END:variables
}
