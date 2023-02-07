package MarcadorBaloncesto;

import java.time.LocalDate;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class MarcadorBaloncesto {

    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    public MarcadorBaloncesto(String nL, String nV) {
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = fecha.now();
    }

    public MarcadorBaloncesto(String nL, String nV, LocalDate f) {
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
        puntosLocal = 0;
        puntosVisitante = 0;
    }

    public MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f) {
        nombreLocal = nL;
        puntosLocal = pL;
        nombreVisitante = nV;
        puntosVisitante = pV;
        fecha = f;
    }

    public String getnombreLocal() {
        return nombreLocal;
    }

    public String getnombreVisitante() {
        return nombreVisitante;
    }

    public void setnombreLocal(String nL) {
        nombreLocal = nL;
    }

    public void setnombreVisitante(String nV) {
        nombreVisitante = nV;
    }

    public void setpuntosLocal(int pL) {
        puntosLocal = pL;
    }

    public int getpuntosLocal() {
        return puntosLocal;
    }

    public void setpuntosVisitante(int pV) {
        puntosVisitante = pV;
    }

    public int getpuntosVisitante() {
        return puntosVisitante;
    }
     public LocalDate getFecha() {
        return fecha;
    }
     
}
