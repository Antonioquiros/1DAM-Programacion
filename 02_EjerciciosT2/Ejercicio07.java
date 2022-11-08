/*
 */
package ejercicio07_tema2;
import bpc.daw.objetos.*;

/**
 *
 * @author anton
 */
public class Ejercicio07_tema2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        DepositoAgua a1 = null;
        a1=new DepositoAgua(15,50);
        a1.dibujar();
        double porcentaje= (15*100)/50;
        System.out.println("El porcentaje de agua que hay en el deposito es de un "+porcentaje+" % de su capacidad");
   
        
        
        
      
        
    }
    
}
