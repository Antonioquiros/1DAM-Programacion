
package actividad04_tema2;
import bpc.daw.mario.*;

/**
 *
 * @author antonio antonioquiros2324@gmail.com
 */
public class Actividad04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luigi l1 = null;
        Mario m1 = null;
        m1= new Mario(550,500);
        l1=new Luigi(500,500);
        double distancia = l1.getDistanciaOrigen();
        double distancia2 = m1.getDistanciaOrigen();
        System.out.println("El munieco de Luigi esta a distancia "+distancia);
         System.out.println("El munieco de Mario esta a distancia "+distancia2);
        
        
    }
    
}
