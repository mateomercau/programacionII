package ej9;

public class Rectangulo extends FiguraGeometrica{
    private int lado1;
    private int lado2;

    public Rectangulo() {

    }


    public Rectangulo(int cantLados, int lado1, int lado2) {
        super(cantLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1*2+lado2*2;
    }

    @Override
    public double calcularArea() {
        return lado1*lado2;

    }
    @Override
    public void mostarInfo() {
        System.out.println("rectangulo");
        System.out.println("perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

    }
}
