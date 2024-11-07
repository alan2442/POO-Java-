package polimorfismoJava.sobrecargaDeMetodos;

public class Calculadora {
    
    // Método sobrecarregado para somar dois número inteiros
     int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado para somar três número inteiros
     int somar(int a, int b, int c) {
        return a + b + c;
    }

     // Método sobrecarregado para somar dois números de ponto flutuante
      double somar(double a , double b) {
        return a + b;
     }


}
