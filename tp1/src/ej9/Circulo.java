package ej9;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo() {

    }

    public Circulo(int cantLados, double radio) {
        super(cantLados);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2* Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public void mostarInfo() {
        System.out.println("circulo");
        System.out.println("perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

    }
}
