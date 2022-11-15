
package ejercicio09;
import bpc.daw.objetos.*;

/**
 *
 * @author anton
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caja c1 = new Caja("Bienvenido al instituto");
       String a = c1.getMensaje();
       System.out.println("El mensaje de la caja es : "+a);
       c1.abrirCaja();
       a = c1.getMensaje();
       System.out.println("El mensaje de la caja es : "+a);
       
        
    }
    
}
