/*
 */
package ejercicio21.t2;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author anton
 */
public class Ejercicio21T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la ruta");
        String ruta = new Scanner(System.in).nextLine();
        File ruta1 = new File(ruta);
        if(ruta1.isDirectory()){
            System.out.println(ruta1.listFiles());
        }else{
            System.out.println("La información introducida es errónea");
        }
    }
    
}
