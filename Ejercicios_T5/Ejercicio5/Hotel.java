package Edificio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Hotel extends Edificio {

    private List<String> clientes = new ArrayList();
    private int maximo;

    public Hotel(String d, int np, int m) {
        super(d, np);
        this.maximo = m;
    }

    public void añadirCliente(String c) {
        this.clientes.add(c);
    }

    public void retirarCliente(String c) {
        this.clientes.remove(c);
    }

}
