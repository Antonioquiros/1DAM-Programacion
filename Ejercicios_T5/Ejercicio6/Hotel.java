package Edificio;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Hotel extends Edificio {

    private List<String> clientes = new ArrayList();
    private int maximo;

    public Hotel(String d, int np, int m) throws IllegalArgumentException {
        super(d, np);
        if (m > 0) {
            this.maximo = m;
        } else {
            IllegalArgumentException e = new IllegalArgumentException("La cantidad máxima que has introducido es negativa");
            throw e;
        }

    }

    public void añadirCliente(String c) throws IllegalArgumentException {
        if (this.clientes.size() > this.maximo) {
            IllegalArgumentException e = new IllegalArgumentException("Has superado el máximo de personas");
        } else {
            this.clientes.add(c);
        }

    }

    public void retirarCliente(String c) throws NoSuchElementException {
        if (!this.clientes.contains(c) ) {
            NoSuchElementException e = new  NoSuchElementException("Esta persona no está en la lista");
        } else {
            this.clientes.remove(c);
        }

    }
}
