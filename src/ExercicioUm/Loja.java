package ExercicioUm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loja {
    public static List <Produto> listaDeProdutos = new ArrayList<>();
    public static void main(String[] args) {

        Produto livro = new Livros("Escravidão", 60, "Laurentino Gomes", 12345);
        Produto cd = new Cd("Calypso", 35, 10, 45678);
        Produto dvd = new Dvd("Snowden", 50,2.1, 1234509);
        Produto cd2 = new Cd("Zeze di Camargo e Luciano", 20, 10, 120987);
        Produto cd3 = new Cd("Rebelde", 40, 10,12234);
        Produto cd4 = new Cd("Rebelde", 40, 10,1223);

        Produto livro1 = new Livros("Escravidão", 60, "Laurentino Gomes", 12345);
        Produto livro2 = new Livros("Escravidão", 60, "Laurentino Gomes", 21241);




        listaDeProdutos.addAll(Arrays.asList(livro,cd,dvd,cd2,cd3,livro1,livro2));

        for (int i = 0; i < listaDeProdutos.size(); i++) {
            listaDeProdutos.get(i).mostrarDetalhesDoProduto();

        }
        System.out.println("---------------------------------------");
        System.out.println(cd3.equals(cd4));
        System.out.println("---------------------------------------");

        System.out.println(Produto.buscarProduto(cd4,listaDeProdutos));




    }



}