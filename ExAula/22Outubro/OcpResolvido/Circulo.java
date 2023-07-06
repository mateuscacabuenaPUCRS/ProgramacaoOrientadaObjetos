public class Circulo extends SomadorAreas{
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public double calculaArea() {
        double area = 2 * Math.PI * raio;
        return area;
    }
    
}
