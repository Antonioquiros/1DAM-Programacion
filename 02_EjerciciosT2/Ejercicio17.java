/*
 */
package ejercicio17.t2;
import bpc.daw.objetos.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ejercicio17T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dime tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Dime tu dominio: ");
        String dominio = new Scanner(System.in).nextLine();
        if(dominio.endsWith(".com")||dominio.endsWith(".es")){
            String correo = nombre+"@"+dominio;
            System.out.println("Tu correo es "+correo);
           
        
    }else{
            System.out.println("El dominio es incorrecto");
        }
    }
    
}
