package ExercicioUm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loja {
    public static List <Produto> listaDeProdutos = new ArrayList<>();
    public static void main(String[] args) {

        Livros livro = new Livros("Escravidão", 60, "Laurentino Gomes", 12345);
        Cd cd = new Cd("Calypso", 35, 10, 45678);
        Dvd dvd = new Dvd("Snowden", 50,2.1, 1234509);
        Cd cd2 = new Cd("Zeze di Camargo e Luciano", 20, 10, 120987);
        Cd cd3 = new Cd("Rebelde", 40, 10,12234);
        Cd cd4 = new Cd("Rebelde", 40, 10,1223);




        listaDeProdutos.addAll(Arrays.asList(livro,cd,dvd,cd2,cd3));

//        for (int i = 0; i < listaDeProdutos.size(); i++) {
//            listaDeProdutos.get(i).mostrarDetalhesDoProduto();
//        }

//        System.out.println(cd3.equals(cd4));

       procurarProduto(cd4);

        }
    public static String procurarProduto(Object o){
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i) == o){
                System.out.println("O item está na "+i+"º posição da lista.");
            }

        } return "O produto não foi encontrado";

    }
}