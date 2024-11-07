

public class Quadrado extends Figura {
    //Atributo lado
    private double lado;

    //Construtor chamado quadrado
    public Quadrado(double lado, String cor) {
        this.lado = lado;
        this.setCor(cor);
    }

    //Reescrevendo o método toString 
    public String toString() {
        return "Quadrado: lado =" + lado + ", cor = " + getCor();
    }
}


