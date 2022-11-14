/*
 */
package ejercicio20t.pkg2;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ejercicio20t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escribe la ruta");
        String ruta = new Scanner(System.in).nextLine();
        File ruta_ = new File(ruta);
        
        
        if(ruta_.exists()&&ruta_.isDirectory()){
            System.out.println("La ruta introducida corresponde a un directorio");
        }else{
            if(ruta_.exists()&&ruta_.isFile()){
                System.out.println("La ruta introducida es un archivo de tamaño "+ruta_.length()+" bytes");
                System.out.println("¿Desea borrarlo?(si/no)");
                String validacion= new Scanner(System.in).nextLine();
                if(validacion.equals("si")){ruta_.delete();
                if(ruta_.delete()){
                    System.out.println("El archivo se a borrado correctamente");
                }else{
                    System.out.println("Se ha producido un error al borrar");
                }
                }else{
                    System.out.println("Borrado cancelado");
                }
            }
            }
    }
    
}
