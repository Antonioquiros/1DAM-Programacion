

package ejercicio05t3;
import java.util.Scanner;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio05T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cuantas piezas se pueden cazar hoy?");
        int p = new Scanner(System.in).nextInt();
        int c;
        int cazadas = 0;
        do{
        System.out.println("Cuantas piezas has cazado hoy?");
        c = new Scanner(System.in).nextInt();
        cazadas = cazadas + c;
        System.out.println("Usted lleva cazadas "+cazadas+" piezas de "+p+""
                + " piezas permitidas");
        if(cazadas == p){
        System.out.println("Usted ha alcanzado el limite permitido");
        System.exit(1);}
        if(cazadas>=p){System.out.println("Usted ha excedido el numero "
                + "de piezas permitido");
        System.exit(1);}}
        while(cazadas<p);
        
    }

}
