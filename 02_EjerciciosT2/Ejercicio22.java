/*
 */
package ejercicio22.t2;
import bpc.daw.objetos.*;

/**
 *
 * @author anton
 */
public class Ejercicio22T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        TarjetaCredito t1 = new TarjetaCredito(5000,1111);
         System.out.println("Esta es la informacion de tu tarjeta "+t1.getSaldo(1111)+" euros");
         try{
             t1.sacarDinero(2000, 1111);
         }
         catch(Exception e){
             System.out.println(e.getMessage());
         }
         System.out.println("Este es el saldo actual de su tarjeta "+t1.getSaldo(1111)+" euros");
       
        
       
    }

    
        }
    

   
    

