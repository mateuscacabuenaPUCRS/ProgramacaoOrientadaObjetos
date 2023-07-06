import java.util.ArrayList;

public class Aplicacao {

    public void executa() {
        ArrayList<SomadorAreas> lista = new ArrayList<SomadorAreas>();
        lista.add(new Circulo(11.11));
        lista.add(new Quadrado(22.22));
        lista.add(new Circulo(33.33));
        lista.add(new Retangulo(2.00));
        lista.add(new Triangulo(2.00, 3.00));
        double area = 0;
        for(SomadorAreas objeto : lista) {
            area += objeto.calculaArea();
        }
        System.out.println("Soma de areas: "+ area);
    }
}
