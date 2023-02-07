package ejercicio3_t4;

import java.time.LocalDate;
import MarcadorBaloncesto.MarcadorBaloncesto;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio3_T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2004, 04, 16);
        MarcadorBaloncesto a = new MarcadorBaloncesto("Arjona CB", "Andujar CB");
        MarcadorBaloncesto b = new MarcadorBaloncesto("Arjona CB", "Andujar CB", d);
        MarcadorBaloncesto c = new MarcadorBaloncesto("Arjonilla CB", 16, "Porcuna CB", 18, d);
        System.out.println(a.getnombreLocal());
        System.out.println(a.getnombreVisitante());
        a.setnombreLocal("Granada");
        System.out.println(a.getnombreLocal());
        b.setpuntosLocal(23);
        b.setpuntosVisitante(55);
        System.out.println("Puntos del equipo local: " + b.getpuntosLocal());
        System.out.println("Puntos del equipo visitante: " + b.getpuntosVisitante());
        System.out.println("Puntos de Arjonilla CB: " + c.getpuntosLocal());
        System.out.println("Puntos Porcuna CB: " + c.getpuntosVisitante());
        

    }

}
