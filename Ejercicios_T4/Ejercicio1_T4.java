

package ejercicio1_t4;
import DNI.DNI;
/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio1_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI a = new DNI(12345672,'X');
        DNI b = new DNI("56789121A");
        System.out.println("Numero del dni a: "+a.getNumero());
        System.out.println("Letra del dni a: "+a.getLetra());
        System.out.println("Numero del dni b: "+b.getNumero());
        System.out.println("Letra del dni b: "+b.getLetra());
    }

}
