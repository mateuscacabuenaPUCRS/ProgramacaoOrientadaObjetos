public class Quadrado extends SomadorAreas {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    public double calculaArea() {
        double area = lado * lado;
        return area;
    }
}
