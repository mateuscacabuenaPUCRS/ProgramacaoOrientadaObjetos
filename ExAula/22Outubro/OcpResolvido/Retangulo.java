public class Retangulo extends SomadorAreas {
    private double lado;

    public Retangulo(double lado) {
        super();
        this.lado = lado;
    }

    public double calculaArea() {
        double area = lado * lado;
        return area;
    }
}
