

public class Retangulo extends Figura {
    //Criando atributos chamados lado1 e lado2
    private double lado1;
    private double lado2;

    //Construtor Retangulo com 3 parâmetros
    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.setCor(cor);
    }

    //Criando Getter getLado1;
    public double getLado1() {
        return this.lado1;
    }

    //Criando Getter getLado2;
    public double getLado2() {
        return this.lado1;
    }

    //Criando Setter setLado1;
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    //Criando Setter setLado2;
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //Metodo para calcular a área do retangulo
    public double area() {
        return this.lado1 * this.lado2;
    }

    public String toString() {
        return "Retangulo: lado1 =" + this.lado1 + ", lado2 = " + this.lado2 + ", cor = " + getCor();
    }

    
 }
