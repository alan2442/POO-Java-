

public class Teste {

    public static void main(String args[]) {

    Retangulo retangulo = new Retangulo(5, 10, "Roxo");
    Quadrado quadrado = new Quadrado(5, "Vermelho");
    Circulo circulo = new Circulo(5, "Amarelo");
    Triangulo triangulo = new Triangulo(5, 10, "Cinza");

    //Imprimindo as medidas do Retangulo e sua área
    System.out.println(retangulo.toString());
    System.out.println("Área do retângulo: " + retangulo.area());
    
    //Imprimindo as medidas do Quadrado
    System.out.println(quadrado.toString());

    //Imprimindo as medidas do Retangulo, sua área e seu diametro
    System.out.println(circulo.toString());
    System.out.println("Área do círculo: " + circulo.area());
    System.out.println("Diâmetro do círculo: " + circulo.getDiametro());

    }
    
    
}
