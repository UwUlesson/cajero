/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author uwuless
 */
public class PrestamoNew extends clasep{

    public PrestamoNew(){
    
    };
    
    private static boolean Valor;
    
    public boolean GetVal(){
        return Valor;
    
    };
    
    public void SetVal(boolean captura){
        Valor = captura;
    
    };
    
    @Override
    public void Transacciones() {
    //aqui verificara primero si supera los 50 millones, si no entonces, le suma cantidad, se hace las fechas de pago,
    //la generacion del numero y se deja para que impresion los recoja y el booleano que verifica si cumple se pone en true
    
    // si si los supera cambia un booleano verifica si cumple y lo pone en false porque paso la cantidad, esto se envia
    // al captura con un getVal
    
    // captura debe mirar el valor de getVal y continuar dependiendo, si no supera los 50 entonces los deja continuar si no
    // le pone error que lo envia a opciones
    
    //pulir
    }
    
}
