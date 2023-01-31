

package ejercicio2_t4;
import Caja.Caja;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio2_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja a = new Caja();
        Caja b = new Caja("hola paco");
        Caja c = new Caja(true,"adios paco");
        System.out.println(a.getMensaje());
        System.out.println(a.getAbierto());
        System.out.println(b.getMensaje());
        System.out.println(b.getAbierto());
        System.out.println(c.getAbierto());
        System.out.println(c.getMensaje());
    }

}
