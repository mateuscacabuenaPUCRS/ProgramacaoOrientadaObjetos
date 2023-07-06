package OCP;

import java.util.ArrayList;

public class SomadorAreas {
    private ArrayList<Object> lista;

    public SomadorAreas(ArrayList<Object> lista) {
        this.lista = lista;
    }
    
    public double calculaArea() {
        double area = 0;
        for(Object o : lista)
            if(o instanceof Quadrado)
                area += ((Quadrado) o).getLado() * ((Quadrado) o).getLado();
            else if (o instanceof Circulo)
                area += 2 * Math.PI * ((Circulo) o).getRaio();
        return area;
    }   
 
}
