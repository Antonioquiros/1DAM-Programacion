package ejercicio09t3;

import java.util.Scanner;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio09T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba un numero");
        double n = new Scanner(System.in).nextInt();
        double s = 1;
        double a = 1;
        boolean res = true;
        if (n >= 0) {
            while (res) {
                if (Math.abs(s - a) <= 0.000001) {
                    s = (1 / 2) * (a + n / a);
                    System.out.println("La raiz cuadrada aproximada es " + s);
                } else {
                    a = s;
                }
            }
        } else {
            System.out.println("Nos has introducido un numero positivo");
        }
    }

}
