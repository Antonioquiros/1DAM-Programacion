/*
 */
package ejercicio11;
import bpc.daw.objetos.*;
/**
 *
 * @author anton
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja c1 = new Caja("Hola buenos dias");
        c1.getMensaje();
        c1.abrirCaja();
        System.out.println("El mensaje de la caja 1 es: "+c1.getMensaje());
        Caja c2 = new Caja("Hola buenas noches");
        c2.getMensaje();
        c2.abrirCaja();
        System.out.println("El mensaje de la caja 2 es: "+c2.getMensaje());
        System.out.println("El mensaje cambiado de la caja 2 a la caja 1 es: "+c2.getMensaje());
        System.out.println("El mensaje camibiado de la caja 1 a la caja 2 es: "+c1.getMensaje());
    }
    
}
