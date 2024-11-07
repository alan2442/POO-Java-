package polimorfismoJava.sobrecargaDeMetodos;



public class TesteCalculadora {
    public static void main(String args[]) {
        Calculadora calc = new Calculadora();
        

        System.out.println(calc.somar(10, 10));
        System.out.println(calc.somar(20, 20, 20));
        System.out.println(calc.somar(30, 30));
    }
}
