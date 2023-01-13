

package ejercicio01.t3;
import java.util.Scanner;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio01T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String[] canciones = {"Mbappe","BZRP Session 50||Duki","Moscow Mule","Tu"
                + " no vive asi","Hasta cuando"};
        
        System.out.println("1.Mbappe");
        System.out.println("2.BZRP Session 50||Duki");
        System.out.println("3.Moscow Mule");
        System.out.println("4.Tu no vive asi");
        System.out.println("5.Hasta cuando");
        System.out.println("Elige una cancion de las que se muestran en la "
                + "pantalla");       
        int a = new Scanner(System.in).nextInt();
       
        
        ArchivoMP3 re = null;
        switch(a){
           case 1:
                 System.out.println("Esta escuchando "+canciones[a-1]);
                  re = new ArchivoMP3("C:\\Users\\anton\\Downloads\\Eladio "
                          + "Carrión - Mbappe (Video Oficial) SEN2 KBRN VOL. 2.mp3");
                 break;
           case 2:
               System.out.println("Esta escuchando "+canciones[a-1]);
               re = new ArchivoMP3("C:\\Users\\anton\\Downloads\\DUKI "
                       + "BZRP Music Sessions 50.mp3");
               break;
           case 3:
               System.out.println("Esta escuchando "+canciones[a-1]);
               re = new ArchivoMP3("C:\\Users\\anton\\Downloads\\"
                       + "Bad Bunny - Moscow Mule (Official Video) Un Verano"
                       + " Sin Ti.mp3");
               break;
           case 4:
               System.out.println("Esta escuchando "+canciones[a-1]);
               re = new ArchivoMP3("C:\\Users\\anton\\Downloads\\Arcangel x "
                       + "Bad Bunny X Dj Luian X Mambo Kingz - Tu No Vive "
                       + "Asi [Video oficial].mp3");
               break;
           case 5:
               System.out.println("Esta escuchando "+canciones[a-1]);
                re = new ArchivoMP3("C:\\Users\\anton\\Downloads\\"
                        + "FERNANDOCOSTA - HASTA CUANDO.mp3");
               break;
               
              
              
       }
         Reproductor repr = new Reproductor(re,false,false);
         repr.play();
        
    }

   

}
