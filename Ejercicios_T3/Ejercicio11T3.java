package ejercicio11t3;

import java.io.*;
import java.util.*;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Ejercicio11T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int añadir = 1;
        int mostrar = 2;
        int salir = 3;
        int pulsar;
        boolean fin = true;
        String n;
        String dni;
        String d;
        String r = "C:/Users/anton/Desktop/poner_el_dni.txt";
        String t;
        PrintWriter p ;
        BufferedReader buf;
        FileInputStream fil;
        InputStreamReader red;

        do {
            System.out.println("1.Añadir nuevo alumno");
            System.out.println("2.Ver los datos de un alumno");
            System.out.println("3.Salir");
            pulsar = new Scanner(System.in).nextInt();
            if (pulsar == añadir) {
                System.out.println("Introduzca el dni del alumno");
                dni = new Scanner(System.in).nextLine();
                System.out.println("Introduzca el nombre del alumno");
                n = new Scanner(System.in).nextLine();
                System.out.println("Introduzca la direccion del alumno");
                d = new Scanner(System.in).nextLine();
                System.out.println("Introduzca el telefono del alumno");
                t = new Scanner(System.in).nextLine();
                try {
                    p= new PrintWriter(r);
                    p.println(n);
                    p.println(d);
                    p.println(t);
                    p.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            if (pulsar == mostrar) {
                System.out.println("Introduzca el dni");
                dni = new Scanner(System.in).nextLine();
                try {
                    fil = new FileInputStream(r);
                    red = new InputStreamReader(fil);
                    buf = new BufferedReader(red);
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }if(pulsar == salir){
                fin = false;
            }
        }while(fin);
        
    }


        
    
    }
