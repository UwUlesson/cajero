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
    
    //valor del prestamo
    private static int Valor;
    public int GetVal(){
        return Valor;
    
    };
    
    public void SetVal(int captura){
        Valor = captura;
    
    };
    
    public static boolean Cumple;
    
    private void VerifPres(int cuant){
        if(GetVal()<=50000000){
            int Deposito=GetVal()+cuant;
            if(Deposito>50000000){
                Cumple=false;
            }else{
                SetVal(Deposito);
                Cumple=true;
            }
        }else{
            Cumple=false;
        }
    }
    
    @Override
    public void Transacciones() {
        prestamo pres = new prestamo();
        VerifPres(pres.GetValText());
    }
    
}
