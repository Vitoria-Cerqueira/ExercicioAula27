package ExercicioUm;

import java.util.List;
import java.util.Objects;

abstract class Produto {
    public String nome;
    public double preco;
    public int codigoDeBarras;

    public Produto(String nome, double preco, int codigoDeBarras){
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }
    public void mostrarDetalhesDoProduto(){
        System.out.println("------------------------------");
        System.out.println("Datelhes do pruduto");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Codigo de barras: " + codigoDeBarras);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigoDeBarras == produto.codigoDeBarras;
    }


    public static String buscarProduto(Produto objeto, List<Produto> listaDeProdutos) {
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i) == objeto) {
                return "O produto está no indice " + i;
            }
        }
        return "Produto não encontrado";
    }

}


