

package ejercicio08t3;
import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio08T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        System.out.println("Escriba una frase");
        a = new Scanner(System.in).nextLine();
        StringTokenizer x = new StringTokenizer(a);
       while(x.hasMoreTokens()){
       System.out.println(x.nextToken());}
        
    }

}
