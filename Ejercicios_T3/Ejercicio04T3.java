package ejercicio04t3;

import java.util.Scanner;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio04T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Eres mayor de edad?");
        String p = new Scanner(System.in).nextLine();
        p.toLowerCase();
        boolean x = (p.equals("si") || p.equals("no"));
        while (!x) {
            System.out.println("No te entiendo");
            p = new Scanner(System.in).nextLine();
            p.toLowerCase();
            x = (p.equals("si") || p.equals("no"));

        }
        if (p.equals("si")) {
            System.out.println("Eres mayor de edad");
        } else {
            if (p.equals("no")) {
                System.out.println("Eres menor de edad");
            }
        }

    }

}
