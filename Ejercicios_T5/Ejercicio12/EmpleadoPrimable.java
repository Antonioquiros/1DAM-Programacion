package EquipoFutbol;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class EmpleadoPrimable extends Empleado {

    private boolean primado;

    public EmpleadoPrimable(String n, double s) {
        super(n, s);
        this.primado = false;
    }

    public void primar() {
        this.primado = true;
    }

    public boolean esPrimado() {
        return this.primado;
    }

}
