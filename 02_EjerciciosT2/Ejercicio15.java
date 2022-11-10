/*
 */
package ejercicio15.t2;
import java.util.Scanner;
import bpc.daw.objetos.*;

/**
 *
 * @author anton
 */
public class Ejercicio15T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clave ="Hola";
        System.out.println("Introduzca una contraseña: ");
        String contraseña = new Scanner(System.in).nextLine();
        System.out.println("¿Se a utilizado la misma contraseña? "+clave.equals(contraseña));
    }
    
}
