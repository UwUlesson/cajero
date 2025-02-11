/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author estudiantes
 */
public class IdPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form prestamo
     */
    public IdPrestamo() {
        initComponents();
        setLocationRelativeTo(null);
        ((AbstractDocument) Id.getDocument()).setDocumentFilter(new IdPrestamo.NumericFilter(10));
        ((AbstractDocument) TelCas.getDocument()).setDocumentFilter(new IdPrestamo.NumericFilter(10));
        ((AbstractDocument) TelMov.getDocument()).setDocumentFilter(new IdPrestamo.NumericFilter(10));
        ((AbstractDocument) PriNom.getDocument()).setDocumentFilter(new IdPrestamo.LetterFilter(50));
        ((AbstractDocument) PriApe.getDocument()).setDocumentFilter(new IdPrestamo.LetterFilter(50));
        ((AbstractDocument) SegApe.getDocument()).setDocumentFilter(new IdPrestamo.LetterFilter(50));
    }

     public class NumericFilter extends DocumentFilter {
    
        private int maxLength;

        public NumericFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string == null) {
                return;
            }
            // Obtenemos el texto actual del documento
            Document doc = fb.getDocument();
            String currentText = doc.getText(0, doc.getLength());
            // Verificamos que la nueva cadena solo contenga dígitos y que no se exceda la longitud máxima
            if (!string.contains("-") && string.matches("[0-9]+") && (currentText.length() + string.length() <= maxLength)) {
                super.insertString(fb, offset, string, attr);
            }
        // Si no cumple, no se inserta nada
        }
    
        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text == null) {
                return;
            }
            Document doc = fb.getDocument();
            String currentText = doc.getText(0, doc.getLength());
            // Calcula la longitud que tendría el texto después de la operación:
            int newLength = currentText.length() - length + text.length();
            // Verificamos que el texto nuevo solo contenga dígitos y no exceda el límite
            if (!text.contains("-") && text.matches("[0-9]+") && newLength <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
            // Si no cumple, no se hace el reemplazo
        }
    }
     
     
    //metodo que solo acepte letras
     
    public class LetterFilter extends DocumentFilter {
    
        private int maxLength;

        public LetterFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string == null) {
                return;
            }
            // Obtenemos el texto actual del documento
            Document doc = fb.getDocument();
            String currentText = doc.getText(0, doc.getLength());
            // Verificamos que la nueva cadena solo contenga letras y que no se exceda la longitud máxima
            if (!string.matches("[0-9]+") && (currentText.length() + string.length() <= maxLength)) {
                super.insertString(fb, offset, string, attr);
            }
        // Si no cumple, no se inserta nada
        }
    
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text == null) {
                return;
            }
            Document doc = fb.getDocument();
            String currentText = doc.getText(0, doc.getLength());
            // Calcula la longitud que tendría el texto después de la operación:
            int newLength = currentText.length() - length + text.length();
            // Verificamos que el texto nuevo solo contenga letras y no exceda el límite
            if (!text.matches("[0-9]+") && newLength <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
            // Si no cumple, no se hace el reemplazo
        }
    }
    
    //verificador si estan vacios
    
    private boolean vacios(){
        return Id.getText().trim().isEmpty() ||
              PriApe.getText().trim().isEmpty() ||
              PriNom.getText().trim().isEmpty() ||
              SegApe.getText().trim().isEmpty() ||
              TelCas.getText().trim().isEmpty() ||
              TelMov.getText().trim().isEmpty();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Id = new javax.swing.JTextField();
        PriNom = new javax.swing.JTextField();
        PriApe = new javax.swing.JTextField();
        SegApe = new javax.swing.JTextField();
        TelCas = new javax.swing.JTextField();
        TelMov = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Prestamo Identificacion");

        jLabel2.setText("No Identidad:");

        jLabel3.setText("Primer Nombre:");

        jLabel4.setText("Primer Apellido:");

        jLabel5.setText("Telefono casa:");

        jLabel6.setText("Segundo Apellido:");

        jLabel7.setText("Telefono movil:");

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        PriNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriNomActionPerformed(evt);
            }
        });

        PriApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriApeActionPerformed(evt);
            }
        });

        SegApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegApeActionPerformed(evt);
            }
        });

        TelCas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelCasActionPerformed(evt);
            }
        });

        TelMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelMovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TelMov)
                                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriNom, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PriApe, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SegApe, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelCas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 248, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PriNom, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriApe, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SegApe, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelCas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelMov, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Opciones opt = new Opciones();
        opt.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(vacios()){
            Warning war = new Warning();
            war.setVisible(true);
            this.dispose();
        }else{
            SetAll();
            prestamo pres = new prestamo();
            pres.setVisible(true);
            this.dispose();
        }
        
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private static String Iden;
    private static String PrimNom;
    private static String PrimApell;
    private static String SeguApell;
    private static String TeleCasa;
    private static String TeleMovil;
    
    public void SetAll(){
        Iden = Id.getText();
        PrimNom = PriNom.getText();
        PrimApell = PriApe.getText();
        SeguApell = SegApe.getText();
        TeleCasa = TelCas.getText();
        TeleMovil = TelMov.getText();
        
    }
    
    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        Iden = Id.getText();
    }//GEN-LAST:event_IdActionPerformed

    private void PriNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriNomActionPerformed
        PrimNom = PriNom.getText();
    }//GEN-LAST:event_PriNomActionPerformed

    private void PriApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriApeActionPerformed
        PrimApell = PriApe.getText();
    }//GEN-LAST:event_PriApeActionPerformed

    private void SegApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegApeActionPerformed
        SeguApell = SegApe.getText();
    }//GEN-LAST:event_SegApeActionPerformed

    private void TelCasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelCasActionPerformed
        TeleCasa = TelCas.getText();
    }//GEN-LAST:event_TelCasActionPerformed

    private void TelMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelMovActionPerformed
        TeleMovil = TelMov.getText();
    }//GEN-LAST:event_TelMovActionPerformed
     
    public String getIden() {
        return Iden;
    }
    public String getPrimNom() {
        return PrimNom;
    }
    public String getPrimApell() {
        return PrimApell;
    }
    public String getSeguApell() {
        return SeguApell;
    }
    public String getTeleCasa() {
        return TeleCasa;
    }
    public String getTeleMovil() {
        return TeleMovil;
    }
  
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
            java.util.logging.Logger.getLogger(IdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JTextField PriApe;
    private javax.swing.JTextField PriNom;
    private javax.swing.JTextField SegApe;
    private javax.swing.JTextField TelCas;
    private javax.swing.JTextField TelMov;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
