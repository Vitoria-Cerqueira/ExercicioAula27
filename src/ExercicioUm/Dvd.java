package ExercicioUm;

public class Dvd extends Produto{
    public double duracao;
    public Dvd(String nome, double preco, double duracao,int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoProduto(){
        super.mostrarDetalhesDoProduto();
        System.out.println("Duração: " + duracao);
    }
}
