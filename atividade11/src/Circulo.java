

import java.lang.Math;

public class Circulo extends Figura {
    //Atributo raio
    private double raio;

    //Construtor chamado Circulo
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.setCor(cor);
    }

    //Getter getRaio
    public double getRaio() {
        return this.raio;
    }

    //Setter setRaio 
    public void setRaio(double raio) {
        this.raio = raio;
    }

    //Método area
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    //Método getDiametro, para calcular o diametro
    public double getDiametro() {
        return 2 * raio;
    }

    //Reescrevendo o método toString
    public String toString() {
        return "Circulo: raio = " + raio + ", cor = " + getCor();
    }


}
