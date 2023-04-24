package FigurasGeometricas;

import java.awt.Point;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public interface Apoyable {

    public int getLongitudBase();

    public int getLongitudAltura();

    public default boolean esHorizontal() {
        if (this.getLongitudBase() > this.getLongitudAltura()) {
        }
        return true;
    }

    public default boolean esVertical() {
        if (this.getLongitudAltura() > this.getLongitudBase()) {
        }
        return true;
    }
}
