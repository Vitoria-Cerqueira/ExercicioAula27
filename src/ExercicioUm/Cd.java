package ExercicioUm;

public class Cd extends Produto{
    public int numeroDeFaixa;
    public Cd(String nome, double preco, int numeroDeFaixa, int codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixa = numeroDeFaixa;
    }
    @Override
    public void mostrarDetalhesDoProduto(){
        super.mostrarDetalhesDoProduto();
        System.out.println("Numero de faixa: " + numeroDeFaixa);
    }

    public int getNumeroDeFaixa() {
        return numeroDeFaixa;
    }
}
