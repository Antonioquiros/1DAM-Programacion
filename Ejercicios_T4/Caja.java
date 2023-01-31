package Caja;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Caja {

    private boolean abierto;
    private String mensaje;
    private String cadena1 = "La caja esta cerrada";
    private String cadena2 = "La caja esta abierta";

    public Caja() {
        abierto = false;
        mensaje = "Viva el tema 7";
    }

    public Caja(String m) {
        mensaje = m;
        abierto = false;
    }

    public Caja(boolean a, String m) {
        abierto = a;
        mensaje = m;

    }

    public String getMensaje() {
        if (abierto) {
            return mensaje;
        } else {
            return cadena1;
        }
    }

    public String getAbierto() {
        if (abierto) {
            return cadena2;
        } else {
            return cadena1;
        }
    }

}
