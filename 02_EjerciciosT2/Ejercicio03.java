
package actividad03_tem2;
import bpc.daw.mario.*;


/**
 *
 * @author antonio antonioquiros2324@gmail.com
 */
public class Actividad03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Seta s1 = null;
        s1=new Seta(300,100);
        s1.andarHacia(0,0);
        Mario m1 = null;
        m1=new Mario(300,500);
        m1.saltar();
        Cañon c1 = null;
        c1=new Cañon(200,122);
        c1.disparar(400, 122);
        Luigi l1 = null;
        l1=new Luigi(400,122);
        Planta p1,p2,p3 = null;
        p1=new Planta(200,300);
        p2= new Planta(250,300);
        p3= new Planta(300,300);
        p1.comer(true);
        p2.comer(true);
        p3.comer(true);
        
        // TODO code application logic here
    }
    
}
