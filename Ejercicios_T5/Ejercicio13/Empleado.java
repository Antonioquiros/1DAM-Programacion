package EquipoFutbol;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Empleado {
     private String nombre;
    private double sueldo;
    private double dinero;
    
    public Empleado(String n, double s){
    this.nombre = n;
    this.sueldo = s;
    this.dinero = 0;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getDinero() {
        return dinero;
    }
    public void cobrar(double cantidad)throws CabreoException{
    this.dinero += cantidad;
    if(cantidad < this.sueldo){
    CabreoException e = new CabreoException("Al empleado "+this.nombre+" no se le han pagado "+(this.sueldo-cantidad)+" euros");
    throw e;
    }

    }
}
