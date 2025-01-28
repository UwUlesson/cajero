
package clases;
import java.util.Scanner;
import clases.Teclado;
import clases.RetiroNew;
public abstract class clasep {
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
    
        int retiro=Teclado.getCasilla();
        System.out.println("esto funciona la cantidad de retiro es"+ retiro);
        RetiroNew ret = new RetiroNew(null,retiro);

        
        
    
    };
    
    //Metodo abstarcto
    public abstract void Transacciones();
    
    /*    public void retiro(){
    
    retiro ret = new retiro(null);
    ret.Transacciones();
    
    };*/
    
    public int getSaldo(){
        
        return saldo;
    }
    
    public void setSaldo(int saldo){
        
        this.saldo = saldo;
    }
    
}
