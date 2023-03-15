package EquipoFutbol;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class CuerpoTecnico extends Empleado{
    private String puesto;
    
    public CuerpoTecnico(String n, double s, String p){
    super(n,s);
    this.puesto = p;
    }

    public String getPuesto() {
        return puesto;
    }
}
