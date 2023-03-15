package Adivinanzas;

import java.time.Instant;
import java.time.Duration;
import AdivinanzaException.*;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Adivinanzas{

    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

    public Adivinanzas(String e, String rc) {
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = inicio.now();
    }

    public String getEnunciado() {
        this.inicio = inicio.now();
        return this.enunciado;
    }

    public void Comprobar(String respuesta) throws AdivinanzaException {
        Instant a =this.inicio;
        this.inicio = inicio.now();
        Duration d = Duration.between(a, this.inicio);
        if (respuesta == this.respuestaCorrecta) {
            if (d.getSeconds() > 30) {
                TiempoSuperadoException e = new TiempoSuperadoException();
                throw e;
            }

        }else{
        AdivinanzaIncorrectaException b = new AdivinanzaIncorrectaException();
        }

    }
}
