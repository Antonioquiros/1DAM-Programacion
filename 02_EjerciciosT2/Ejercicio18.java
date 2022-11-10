/*
 */
package ejercicio18.t2;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ejercicio18T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¿Cual es tu direccion de correo electronico?");
        String correo = new Scanner(System.in).nextLine();
        int numero = correo.indexOf("@");
        String nombre= correo.substring(0,numero);
        String dominio= correo.substring(numero+1,correo.length());
        System.out.println("Su nombre de usuario es: "+nombre);
        System.out.println("Su dominio es: "+dominio);
    }
    
}
