package Rectangulo;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Rectangulo {

    private int base;
    private int altura;
    private int area;

    public Rectangulo(int b, int a) {
        this.base = b;
        this.altura = a;
        this.area = this.base * this.altura;
    }

    public void setBase(int b) {
        this.base = b;
    }

    public void setAltura(int a) {
        this.altura = a;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getBase() {
        return this.base;
    }

    public int getArea() {
        return this.area;
    }

}
