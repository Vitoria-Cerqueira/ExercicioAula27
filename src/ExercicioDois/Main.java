package ExercicioDois;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.3f ,7.7f);
        Circulo circulo = new Circulo(7.7f);
        Quadrado quadrado = new Quadrado(3.5f,4.8f);
        Quadrado quadrado2 = new Quadrado(8.8f, 9);
        Retangulo retangulo2 = new Retangulo(3,5);

        List<Forma> listaForma = new ArrayList<>(5);
        listaForma.addAll(Arrays.asList(retangulo2,retangulo,quadrado,circulo,quadrado2));

        for (int i = 0; i < listaForma.size(); i++) {
            listaForma.get(i).mostrarResultado();
            System.out.println("-------------------------------------------------------");

        }


    }
}
