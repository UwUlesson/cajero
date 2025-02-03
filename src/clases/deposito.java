
package clases;
import clases.Teclado;

public class deposito extends clasep{
    
    private Teclado parentFrame; // Referencia al JFrame original

    // Constructor que recibe la referencia de teclado
    public deposito(Teclado parentFrame) {
        this.parentFrame = parentFrame;
    }
    
    @Override
     public void Transacciones(){
       deposito=Teclado.getCasilla();
       transacciones = getSaldo();
       setSaldo(transacciones + deposito);
       //System.out.println("Depositaste:  " + deposito );
           Consultar consultar = new Consultar();
           consultar.setVisible(true);
           parentFrame.dispose();
}
}