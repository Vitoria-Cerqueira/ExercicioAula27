package ExercicioUm;

public class Livros extends Produto {
    public String autor;

    public Livros(String nome, double preco, String autor, int codigoDeBarras){
       super(nome,preco, codigoDeBarras);
       this.autor = autor;

    }
    @Override
    public void mostrarDetalhesDoProduto(){
        super.mostrarDetalhesDoProduto();
        System.out.println("Autor: " + autor);
    }
}
