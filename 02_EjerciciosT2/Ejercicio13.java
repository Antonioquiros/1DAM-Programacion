/*
 */
package ejercicio13.t2;
import bpc.daw.objetos.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ejercicio13T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Escribe tu nombre :");
         String nombre = new Scanner(System.in).nextLine();
         System.out.println("Tu nombre en mayúsculas: "+nombre.toUpperCase());
         System.out.println("Tu nombre en minúsculas: "+nombre.toLowerCase());
         System.out.println("Total de caracteres de tu nombre: "+nombre.length());
         
        
    }
    
}
