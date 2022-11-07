/*
 */
package actividad02_tema02;
import bpc.daw.mario.*;

/**
 *
 * @author anton
 */
public class Actividad02_tema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Hola";
        Mario m1,m2 = null;
        Luigi l1,l2 = null;
        Seta s1,s2 = null;
        Disparo d1,d2= null;
        Planta p1,p2 = null;
        Cañon c1,c2 = null;
        

        //constructor por defecto
         m1 = new Mario(200,500);
         l1 = new Luigi(300,450);
         s1 = new Seta(400,600);
         d1 = new Disparo(150,300,290,600);
         p1 = new Planta(56,76);
         c1 = new Cañon (12,34);
         
         //constructor con parametros
         
         l2 = new Luigi(25,15);
         s2 = new Seta(25,15);
         d2 = new Disparo(200,255,300,310);
         p2 = new Planta(25,15);
         c2 = new Cañon(25,15);
    }
    
}
