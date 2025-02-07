/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.*;
import javax.swing.text.*;

public class prestamo extends javax.swing.JFrame {


    public prestamo() {
        
        initComponents();
        setLocationRelativeTo(null);
        ((AbstractDocument) Prest.getDocument()).setDocumentFilter(new NumericFilter(8));

    }
    private static Date DateAuth;
    //sumar 11 dias si la funcion supera los 20 dias, devuelve fecha auth
    private void veintDiasAuth(){
        Date FechaSel = fecha.getDate();
        Calendar calen = Calendar.getInstance();
        calen.setTime(FechaSel);
        
        int diaMes = calen.get(Calendar.DAY_OF_MONTH);
        
        if(diaMes>=20){
            //sumar 11 dias + 7 del pago
            DateAuth = sumarDiasAFecha(17);
        }else{
            //establecer fecha pago 7 dias despues
            Date posDate = sumarDiasAFecha(7);
            calen.setTime(posDate);
            if (calen.get(Calendar.DAY_OF_MONTH)>=20){
                DateAuth = sumarDiasAFecha(14);
                
            }else{
                DateAuth = posDate;
                
            }
        }
    }
    
    //getter de autorizacion
    public String StrDateAuth(){
        return ConvDateString(DateAuth);
    
    }
    
    //getter de fecha Tentativa
    
    private Date fechaTentativa(){
        return sumDiasFecha(7,DateAuth);
    
    }
    
    public String StrfechaTent(){
        return ConvDateString(fechaTentativa());
    }
    
    public static String StrfechasPago[];
    // array de las 6 fechas de pago
    public void seisFechasPago(){
        Date fechasPago[];
        fechasPago = new Date[6];
        StrfechasPago = new String[6];
        for(int i=0;i<fechasPago.length;i++){
            fechasPago[i]=(sumMes(i+1,fechaTentativa()));
            StrfechasPago[i]=(ConvDateString(fechasPago[i]));
            System.out.println(StrfechasPago);
        }
    
    }
    //getter de la fecha como string
    public String getStrAuth(){
        return ConvDateString(DateAuth);
    }
    
    //getter de la fecha como date
    public Date getFechaSeleccionada() {
        return fecha.getDate(); // Retorna el valor actual del JDateChooser
    }
    
    public String getStringFechaSel(){
        return ConvDateString(getFechaSeleccionada());
    }
    
    public String ConvDateString(Date fechaDate) {
        if (fechaDate == null) {
            return ""; // Retorna cadena vacía si la fecha es null
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(fechaDate);
    }
    //valor del cuadro texto
    
    private static int ValText;
    
    public int GetValText(){
        return ValText;
    
    };
    
    public void SetValText(int captura){
        ValText = captura;
    
    };
    
    //contador
    
    private static int cont=0;
    
    
    public int GetCont(){
        return cont;
    
    };
    //sumar meses
    public Date sumarMesesAFecha(int meses) {
        //fecha es el cuadro de la fecha
        //fecha seleccionada es la variable de la fecha
        if (fecha.getDate() == null) {
            throw new IllegalArgumentException("No se ha seleccionado una fecha");
        }
        // Convertir Date a LocalDate (Java 8+)
        LocalDate fechalocal = fecha.getDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        // Sumar meses
        LocalDate nuevaFecha = fechalocal.plusMonths(meses);
        // Convertir LocalDate a Date (para asignar de vuelta al JDateChooser si es necesario)
        return Date.from(nuevaFecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    //sumar meses pero a fecha seleccionada|
    public Date sumMes(int meses, Date fechaPed) {
        //fecha es el cuadro de la fecha
        //fecha seleccionada es la variable de la fecha
        if (fechaPed == null) {
            throw new IllegalArgumentException("No se ha seleccionado una fecha");
        }
        // Convertir Date a LocalDate 
        LocalDate fechalocal = fechaPed.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        // Sumar meses
        LocalDate nuevaFecha = fechalocal.plusMonths(meses);
        // Convertir LocalDate a Date (para asignar de vuelta al JDateChooser si es necesario)
        return Date.from(nuevaFecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    //sumar dias
    public Date sumarDiasAFecha(int dias) {
    if (fecha.getDate() == null) {
        throw new IllegalArgumentException("No se ha seleccionado una fecha");
    }
    
    // Convertir Date a LocalDate 
    LocalDate fechaLocal = fecha.getDate().toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
    
    // Sumar días
    LocalDate nuevaFecha = fechaLocal.plusDays(dias);
    
    // Convertir de vuelta a Date
    return Date.from(nuevaFecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    
    
    //sumar dias a fecha pedida
    public Date sumDiasFecha(int dias, Date fechaPed) {
    
    // Convertir Date a LocalDate (Java 8+)
    LocalDate fechaLocal = fechaPed.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
    
    // Sumar días
    LocalDate nuevaFecha = fechaLocal.plusDays(dias);
    
    // Convertir de vuelta a Date
    return Date.from(nuevaFecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    
    //obtener dias
    public int GetDias(Date fechaPed) {
    
    // Convertir Date a LocalDate (Java 8+)
    LocalDate fechaLocal = fechaPed.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();
    
    // dia del mes
    int DiaMes = fechaLocal.getDayOfMonth();
    
    // Convertir de vuelta a Date
    return DiaMes;
    }
       
    
    
    //filtro para que solo acepte numeros y limite
    public class NumericFilter extends DocumentFilter {
    
        private int maxLength;

        public NumericFilter(int maxLength) {
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
            // Verificamos que la nueva cadena solo contenga dígitos y que no se exceda la longitud máxima
            if (string.matches("[0-9]+") && (currentText.length() + string.length() <= maxLength)) {
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
            // Verificamos que el texto nuevo solo contenga dígitos y no exceda el límite
            if (text.matches("[0-9]+") && newLength <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
            // Si no cumple, no se hace el reemplazo
        }
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
        Prest = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("Prestamo");

        jLabel2.setText("Cuanto quiere pedir:");

        Prest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Solicitud:");

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

        fecha.setMinSelectableDate(new java.util.Date(-62135747936000L));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("(puede pedir hasta 50 millones)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Prest)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Prest, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Opciones opt = new Opciones();
        opt.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private static String fechaForm;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{    
            PrestamoNew pres = new PrestamoNew();
            if((fecha.getDate() == null && Prest.getText().trim().isEmpty())||
                    (Prest.getText().equals("0")||
                    (Integer.parseInt(Prest.getText()))>50000000)||
                    (GetDias(fecha.getDate())>=20)||
                    ((pres.GetVal()+Integer.parseInt(Prest.getText()))>50000000)){                           
                Warning war = new Warning();
                war.setVisible(true);
                this.dispose();

            }else{
                this.cont+=1;
                fechaForm = ConvDateString(fecha.getDate());
                veintDiasAuth();
                seisFechasPago();
                SetValText(Integer.parseInt(this.Prest.getText()));
                clasep transac = new PrestamoNew();
                transac.Transacciones(); 
                captura cap = new captura();
                if(cap.GetCap()==null){
                    cap.setVisible(true);
                    this.dispose();

                }else{
                    impresion imp = new impresion();
                    imp.setVisible(true);
                    this.dispose();
                }    
            }
        }
        catch(Exception e){
            Warning war = new Warning();
            war.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public String GetfechaForm(){

        return fechaForm;
        
    }
    
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
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Prest;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
