/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import clases.Opciones;
import clases.bienvenida;

public class EstadoSesion {
    private static EstadoSesion instancia;
    private boolean esIni;
    private boolean esOpt;

    // Constructor privado
    private EstadoSesion() {
        // Inicializamos los valores por defecto
        esIni = false;
        esOpt = false;
    }

    // Método estático para obtener la instancia única
    public static EstadoSesion getInstancia() {
        if (instancia == null) {
            instancia = new EstadoSesion();  // Crear la instancia solo si no existe
        }
        return instancia;
    }

    // Métodos para obtener y actualizar los estados
    public boolean getEsIni() {
        return esIni;
    }

    public void setEsIni(boolean esIni) {
        this.esIni = esIni;
    }

    public boolean getEsOpt() {
        return esOpt;
    }

    public void setEsOpt(boolean esOpt) {
        this.esOpt = esOpt;
    }
}
