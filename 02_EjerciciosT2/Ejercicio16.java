/*
 */
package ejercicio16.t2;
import bpc.daw.objetos.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ejercicio16T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca la frase 1: ");
        String f_1 = new Scanner(System.in).nextLine();
        System.out.println("Introduzca la frase 2: ");
        String f_2 = new Scanner(System.in).nextLine();
        int numero = f_1.indexOf(f_2);
        if(numero == -1){
            System.out.println("¿Esta el texto 2 incluido en el texto 1? False ");
        }else{
            System.out.println("¿Esta el texto 2 incluido en el texto 1? True ");
        }
            }
    
}
