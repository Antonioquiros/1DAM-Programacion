
package ejercicio23.t2;
import bpc.daw.objetos.*;
import java.util.Scanner;
/**
 *
 * author anton@
 */
public class Ejercicio23T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        TarjetaCredito t1 = new TarjetaCredito(1000,2222);
        
        System.out.println("Esta es la informacion de la tarjeta: "+t1.getSaldo(2222)+" euros");
        try{
            t1.ingresarDinero(100);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Este es tu saldo despues del ingreso: "+t1.getSaldo(2222)+" euros");
        try{
            t1.sacarDinero(2800, 2222);
            }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("El saldo de su tarjeta tras el retiro del dinero es "+t1.sacarDinero(2800, 2222)+" euros");
       
       
    }
    
}
