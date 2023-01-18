package ejercicio10t3;

import java.io.*;
import java.util.*;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio10T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String r;
        System.out.println("Introduzca una ruta a un archivo de texto");
        r = new Scanner(System.in).nextLine();
        try {
            BufferedReader buf = new BufferedReader(new FileReader(r));
            String linea;
            while ((linea = buf.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
