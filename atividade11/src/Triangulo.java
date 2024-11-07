

public class Triangulo extends Figura {
    //Atributos base e altura
    private double base;
    private double altura;

    //Construtor Triangulo
    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.setCor(cor);
    }

    //Método para calcular a area
    public double area() {
        return base * altura / 2;
    }

    //Reescrevendo o método toString
    public String toString() {
        return "Triangulo: base = " + this.base + ", altura = " + this.altura + ", cor = " + this.getCor();
    }

}
