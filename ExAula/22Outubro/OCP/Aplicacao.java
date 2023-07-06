package OCP;

import java.util.ArrayList;

public class Aplicacao {

    public void executa() {
        ArrayList<Object> lista = new ArrayList<Object>();
        lista.add(new Circulo(11.11));
        lista.add(new Quadrado(22.22));
        lista.add(new Circulo(33.33));
        SomadorAreas somador = new SomadorAreas(lista);
        System.out.println("Soma de areas: "+somador.calculaArea());
    }
}
