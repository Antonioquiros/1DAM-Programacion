package Sorteo;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Sorteo {

    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    public int totalParticipantes;
    private double dineroRecogido;

    public Sorteo(double dineroCupon, int totalPersonas) {
        this.dineroCupon = dineroCupon;
        this.pagosRealizados = 0;
        this.pagosPendientes = totalPersonas;
        this.totalParticipantes = totalPersonas;
    }

    public void registrarPago() {
        this.pagosRealizados++;
        this.pagosPendientes--;
        this.dineroRecogido += dineroCupon;
    }

    public void apuntarNuevoParticipante() {
        this.totalParticipantes++;
        this.pagosPendientes++;
    }

}
