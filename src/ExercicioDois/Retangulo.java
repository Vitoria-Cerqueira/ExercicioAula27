package ExercicioDois;

public class Retangulo extends Forma {

    public float lado;
    public float altura;

    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }
    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (lado*2) + (altura*2);
    }

    @Override
    public void mostrarResultado(){
        System.out.println("O resultado da aerea do retangulo é: " + calcularArea());
        System.out.println("O resultado da perimetro do retangulo é: " + calcularPerimetro());
    }
}
