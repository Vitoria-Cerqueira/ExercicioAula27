package ExercicioDois;

public class Quadrado extends Retangulo{
    public Quadrado(float lado, float altura) {
        super(lado, altura);
    }
    @Override
    public void mostrarResultado(){
        System.out.println("O resultado da aerea do quadrado é: " + calcularArea());
        System.out.println("O resultado da perimetro do quadrado é: " + calcularPerimetro());
    }

}
