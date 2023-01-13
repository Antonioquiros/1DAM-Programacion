package ejercicio03t3;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio03T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean repetir = true;
        while (repetir) {
            int x = (int) (Math.random() * 10 + 1);
            System.out.println(x);
            repetir = 10 != x;
        }

    }

}
