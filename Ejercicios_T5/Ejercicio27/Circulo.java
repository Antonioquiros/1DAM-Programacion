package FigurasGeometricas;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Antonio Quirós García <aquigar1604@g.educaand.es>
 */
public class Circulo implements FiguraGeometrica, Centrable{
    private Point centro;
    private int radio;
    private Color color;
    
    public Circulo(Point centro, int r, Color c){
    this.centro = centro;
    this.color = c;
    this.radio = r;
    }

    @Override
    public double getArea() {
        double area;
        area = 3.14*this.radio*this.radio;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro;
        perimetro = (int) (2*3.14*this.radio);
        return perimetro;
    }

    @Override
    public void dibujar(Graphics g) {
        g.drawOval(this.centro.x, this.centro.y, radio, radio);
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Point getCentro() {
        return this.centro;
    }
    
    
    
    
}
