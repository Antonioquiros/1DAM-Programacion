
package ejercicio06_tema2;
import bpc.daw.mario.*;
import java.util.Scanner;

/**
 *
 * @author antonio antonioquiros2324@gmail.com
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mario m1 = null;
        m1 = new Mario();
        int m2;
        int m3;
        
        System.out.println("Introduce la coordenada X para crear a Mario");
        m2 = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada Y para crear a Mario");
        m3 = new Scanner(System.in).nextInt();
        m1.colocar(m2, m3);
        
        // TODO code application logic here
    }
    
}
