package Edificio;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Rascacielos extends Edificio {

    private int altura;

    public Rascacielos(String d, int np, int a) {
        super(d, np);
        if (this.altura < 0) {
            IllegalArgumentException e = new IllegalArgumentException("Ha introducido una altura negativa");
            throw e;
        } else {
            this.altura = a;
        }
    }

    public int getAltura() throws IllegalArgumentException {

        return this.altura+3*Rascacielos.super.getNumeroPlantas();

    }
}
