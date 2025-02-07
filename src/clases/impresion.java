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
        this.FechaAuth.setText(pres.StrDateAuth());
        this.FechaTent.setText(pres.StrfechaTent());
        this.Fecha1.setText(pres.StrfechasPago[0]);
        this.Fecha2.setText(pres.StrfechasPago[1]);
        this.Fecha3.setText(pres.StrfechasPago[2]);
        this.Fecha4.setText(pres.StrfechasPago[3]);
        this.Fecha5.setText(pres.StrfechasPago[4]);
        this.Fecha6.setText(pres.StrfechasPago[5]);
        
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

        jLabel12 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();
        FechaAuth = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FechaTent = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Fecha2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Fecha3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Fecha4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Fecha5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Fecha6 = new javax.swing.JLabel();

        jLabel12.setText("Fecha 1");

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

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel2.setText("Numero Prestamo");

        Numero.setText("Numero");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel3.setText("Cantidad Prestamo");

        CantPres.setText("CantPres");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel4.setText("Prestamos totales");

        PresTot.setText("PresTot");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel5.setText("Id prestamista");

        Id.setText("Id");

        opcional1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        opcional1.setText("Nombre prestamista");

        opcional2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        opcional2.setText("apellidos prestamista");

        opcional3.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        opcional3.setText("Telefono Casa");

        opcional4.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        opcional4.setText("Telefono Movil");

        NomPres.setText("NomPres");

        ApellPres.setText("ApellPres");

        TelCasa.setText("TelCasa");

        TelMovil.setText("TelMovil");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel6.setText("Fecha Autorizacion");

        FechaAuth.setText("FechaAuth");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel7.setText("Fecha tentativa");

        FechaTent.setText("FechaTent");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel9.setText("Fechas de pago");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel10.setText("Fecha 1");

        Fecha1.setText("Fecha1");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel13.setText("Fecha 2");

        Fecha2.setText("Fecha2");

        jLabel15.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel15.setText("Fecha 3");

        Fecha3.setText("Fecha3");

        jLabel17.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel17.setText("Fecha 4");

        Fecha4.setText("Fecha4");

        jLabel19.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel19.setText("Fecha 5");

        Fecha5.setText("Fecha5");

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel21.setText("Fecha limite");

        Fecha6.setText("Fecha6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CantPres)
                                    .addComponent(PresTot)
                                    .addComponent(FechaAuth))
                                .addGap(250, 250, 250)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FechaTent)
                                        .addGap(8, 8, 8))
                                    .addComponent(TelMovil, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelCasa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NomPres)
                                        .addComponent(ApellPres))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Fecha1)
                                                .addComponent(Fecha4)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(opcional4)
                                            .addComponent(opcional3)
                                            .addComponent(opcional2)
                                            .addComponent(opcional1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Fecha3)
                                                .addComponent(jLabel7)
                                                .addComponent(Fecha6))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Fecha2)
                                        .addGap(191, 191, 191))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel19))
                                                .addGap(81, 81, 81))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Fecha5)
                                                .addGap(38, 38, 38)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel15)))))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Id)
                            .addComponent(Numero))))
                .addGap(56, 56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaAuth)
                    .addComponent(FechaTent))
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha1)
                    .addComponent(Fecha2)
                    .addComponent(Fecha3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha4)
                    .addComponent(Fecha5)
                    .addComponent(Fecha6))
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Opciones opt = new Opciones();
        opt.set_esPres(false);
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
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel Fecha2;
    private javax.swing.JLabel Fecha3;
    private javax.swing.JLabel Fecha4;
    private javax.swing.JLabel Fecha5;
    private javax.swing.JLabel Fecha6;
    private javax.swing.JLabel FechaAuth;
    private javax.swing.JLabel FechaTent;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel NomPres;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel PresTot;
    private javax.swing.JLabel TelCasa;
    private javax.swing.JLabel TelMovil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel opcional1;
    private javax.swing.JLabel opcional2;
    private javax.swing.JLabel opcional3;
    private javax.swing.JLabel opcional4;
    // End of variables declaration//GEN-END:variables
}
