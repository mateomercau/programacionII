package ej9;

public abstract class FiguraGeometrica {
    private int cantLados;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int cantLados) {
        this.cantLados = cantLados;
    }

    public int getCantLados() {
        return cantLados;
    }

    public void setCantLados(int cantLados) {
        this.cantLados = cantLados;
    }


    abstract double calcularPerimetro();

    public abstract double calcularArea();
    public abstract void mostarInfo();


}
