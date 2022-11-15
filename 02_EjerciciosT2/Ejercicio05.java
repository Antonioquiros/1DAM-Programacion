
package actividad05_tema2;
import bpc.daw.mario.*;
import java.util.Scanner;

/**
 *
 * @author antonio antonioquiros2324@gmail.com
 */
public class Actividad05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cañon c1,c2 = null;
        c1 = new Cañon(200,300);
        c2 = new Cañon(250,350);
        c1.disparar(500, 300);
        c1.disparar(600, 600);
        c2.disparar(600, 400);
        c2.disparar(300, 500);
        c2.disparar(500, 200);
        int cañon1 = 0;
        int cañon2 = 0;
        System.out.println("¿Cuantas veces a disparado el cañon 1?");
        cañon1 = new Scanner(System.in).nextInt();
        System.out.println("¿Cuantas veces a disparado el cañon 2?");
        cañon2 = new Scanner(System.in).nextInt();
        
        
    }
    
}
