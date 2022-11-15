
package ejercicio08;
import bpc.daw.objetos.*;
/**
 *
 * @author anton
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DepositoAgua d1,d2,d3,d4 = null;
        d1= new DepositoAgua(15,20);
        d2= new DepositoAgua(5,20);
        d3= new DepositoAgua(15,20);
        d4= new DepositoAgua(5,20);
        System.out.println("Aqui tenemos el deposito 1 antes del cambio");
        d1.dibujar();
         System.out.println("Aqui tenemos el deposito 2 antes del cambio");
        d2.dibujar();
        
        d3.retirarLitro();
        d3.retirarLitro();
        d3.retirarLitro();
        d3.retirarLitro();
        d3.retirarLitro();
         System.out.println("Aqui tenemos el deposito 1 despues del cambio");
        d3.dibujar();
        d4.añadirLitro();
        d4.añadirLitro();
        d4.añadirLitro();
        d4.añadirLitro();
        d4.añadirLitro();
         System.out.println("Aqui tenemos el deposito 2 despues del cambio");
        d4.dibujar();
       
        
    }
    
}
