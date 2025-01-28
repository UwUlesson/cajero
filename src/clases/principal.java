package clases;
import clases.bienvenida;

public class principal {
    
    public static void main(String[] args)
    {
        
        clasep mens = new consulta();
        mens.setSaldo(5000000);
        //System.out.println(mens.getSaldo())
        bienvenida bien = new bienvenida();
        bien.setVisible(true);
        //mens.operaciones();
        
    }
    
}
