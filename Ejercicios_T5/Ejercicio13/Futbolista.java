package EquipoFutbol;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Futbolista extends EmpleadoPrimable{
    private int dorsal;
    public Futbolista(String n, double s, int d){
    super(n,s);
    this.dorsal = d;
    }
}
