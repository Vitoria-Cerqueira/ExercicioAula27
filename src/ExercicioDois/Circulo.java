package ExercicioDois;

public class Circulo extends Forma{

    public  float raio;
    public float pi = 3.14f;
    public Circulo(float raio){
        this.raio = raio;
    }
    @Override
    public float calcularArea() {
        return pi*(raio*raio);
    }

    @Override
    public float calcularPerimetro() {
        return 2*pi*raio;
    }

    @Override
    public void mostrarResultado(){
        System.out.println("O resultado da aerea do circulo é: " + calcularArea());
        System.out.println("O resultado da perimetro do circulo é: " + calcularPerimetro());
    }
}
