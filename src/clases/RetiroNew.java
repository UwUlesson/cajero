
package clases;
import clases.Warning;
import clases.Teclado;
import clases.Consultar;

public class RetiroNew extends clasep{
    
    private Teclado parentFrame; // Referencia al JFrame original
    private static boolean errRet = false;
    public void Set_errRet(boolean val){ 
        errRet = val; 

    } 
    
    public boolean Get_errRet(){ 
        return errRet; 
        
    } 

    // Constructor que recibe la referencia de teclado
    public RetiroNew(Teclado parentFrame, Integer retiro) {
        this.parentFrame = parentFrame;
        
        
    }

    @Override
    public void Transacciones(){
        retiro=Teclado.getCasilla();
        if(this.retiro<=getSaldo()){
           transacciones = getSaldo();
           setSaldo(transacciones - this.retiro);
           System.out.println("el retiro leido en transacciones es de "+retiro);
           Consultar consultar = new Consultar();
           consultar.setVisible(true);
           parentFrame.dispose();
           System.out.println("algo raro pasa si lees esto pero no el numero anterior algo pasa");
        }else{
            Set_errRet(true);
            Warning warning = new Warning();
            warning.setVisible(true);
            parentFrame.dispose();
         }
       }
    }
    

