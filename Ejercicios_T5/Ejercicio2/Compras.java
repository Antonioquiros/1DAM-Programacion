package Compras;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Compras {
    private double presupuesto;
    private List<Double> precios = new ArrayList<>();
    
    public Compras(double p){
        this.presupuesto = p;
    }
    public void registrarCompra(double p)throws Exception{
        double a = 0;
        a = this.presupuesto - p;
       if(this.presupuesto <= 0){
       Exception e = new Exception("No hay suficiente presupuesto. Faltan "+Math.abs(a)+" euros");
       throw e;
       }else{
       this.precios.add(p);
       }
        
    }
    
}
