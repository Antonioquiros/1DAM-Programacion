/*
 */
package ejercicio10;
import bpc.daw.objetos.*;

/**
 *
 * @author anton
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja c1 = new Caja("Hola me llamo Antonio");
        c1.abrirCaja();
        c1.getMensaje();
        System.out.println("El mensaje de la caja es: "+c1.getMensaje());
           c1.cambiarMensaje("Cruza ahora que esta en blanco");
           c1.getMensaje();
        System.out.println("El mensaje cambiado es: "+c1.getMensaje());
    }
    
}
