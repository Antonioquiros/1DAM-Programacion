/*
 */
package ejercicio14.t2;
import bpc.daw.objetos.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ejercicio14T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba una frase: ");
        String frase = new Scanner(System.in).nextLine();
       
        System.out.println("La letra de en medio es: " +frase.charAt(frase.length()/2));
    }
    
}
