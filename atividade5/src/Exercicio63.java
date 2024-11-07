import java.util.Scanner;
import java.lang.Math;

public class Exercicio63 {

    public static class ClasseExercicio63 {
        private double largura;
        private double altura;

        // Getter atributo largura
        public double getLargura() {
            return this.largura;
        }

        // Setter atributo largura
        public void setLargura(double largura) {
            this.largura = largura;
        }

         // Getter atributo altura
        public double getAltura() {
            return this.altura;
        }  

         // Setter atributo largura
        public void setAltura(double altura) {
            this.altura = altura;
        }

        //Método para calcular a area
        public double calculaArea (double altura, double largura) {
            double area = altura * largura;

            return area;
        }

        //Método para calcular o perimetro
        public double calculaPerimetro(double altura, double largura) {
            double perimetro = 2 * (altura + largura);

            return perimetro;
        }

        //Método para calcular a diagonal
        public double calculaDiagonal(double altura, double largura) {
            double diagonal = Math.sqrt(((double) Math.pow(altura, 2)) + ((double) Math.pow(largura, 2)));

            return diagonal;
        }

    }
    
    public static void main(String args[]) {
        //Instanciando objetos chamado sc e objetoExercicio
        Scanner sc = new Scanner(System.in);
        ClasseExercicio63 objetoExercicio = new ClasseExercicio63();

        //Recebendo valores de largura e altura e armazenando nos atributos do objetoExercicio
        System.out.println("Digite o valor da largura do retangulo");
        objetoExercicio.setLargura(sc.nextDouble());
        System.out.println("Digite o valor da altura do retangulo");
        objetoExercicio.setAltura(sc.nextDouble());


        //Imprimindo o valor da area do retangulo
        System.out.println("O valor da area do retangulo é :"+ 
        objetoExercicio.calculaArea(objetoExercicio.getAltura(), objetoExercicio.getLargura()));

        //Imprimindo o valor do perimetro do retangulo
        System.out.println("O valor do perimetro do retangulo é :"+ 
        objetoExercicio.calculaPerimetro(objetoExercicio.getAltura(), objetoExercicio.getLargura()));

        //Imprimindo o valor da diagonal do retangulo
        System.out.println("O valor da diagonal do retangulo é :"+ 
        objetoExercicio.calculaDiagonal(objetoExercicio.getAltura(), objetoExercicio.getLargura()));


        sc.close();
    }
}
