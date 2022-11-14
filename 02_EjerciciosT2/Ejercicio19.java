/*
 */
package ejercicio19.t2;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author anton
 */
public class Ejercicio19T2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     System.out.println("Escribe la ruta");
      String ruta_archivo = new Scanner(System.in).nextLine();
     File ruta = new File(ruta_archivo);
     System.out.println("El disco duro ocupa "+ruta.length()+" bytes");
     System.out.println("El disco duro ocupa "+(ruta.length()/1000)+" megabytes");
        
    }
    
}
