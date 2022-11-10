/*
 */
package ejercicio12;
import bpc.daw.objetos.*;

/**
 *
 * @author anton
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcadorBaloncesto mb1 = new MarcadorBaloncesto("Estudiantes","CB Granada");
        boolean anota = mb1.anotarCanasta('L', 2);
        anota = mb1.anotarCanasta('V', 3);
        anota = mb1.anotarCanasta('L', 2);
        anota = mb1.anotarCanasta('v', 2);
        anota = mb1.anotarCanasta('v', 3);
        anota = mb1.anotarCanasta('L', 1);
        anota = mb1.anotarCanasta('L', 1);
        anota = mb1.anotarCanasta('v', 2);
        
        System.out.println( mb1.toString());
        System.out.println("Va ganando el "+mb1.getNombreEquipoGanador());
        System.out.println("Va perdiendo el "+mb1.getNombreEquipoPerdedor());
        
        
        
    }
    
}
