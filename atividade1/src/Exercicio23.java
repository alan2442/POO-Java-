/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo :23. Faça um programa na Linguagem  Java  que efetue a leitura de cinco números inteiros e identificar o maior e o menor
 valor. Não execute a ordenação de valores.*/

//importando a classe Scanner
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String args[]) {
        // instanciando um objeto chamado sc do tipo Scanner
        Scanner sc = new Scanner(System.in);

        // Criando variáveis
        int valor1, valor2, valor3, valor4, valor5;

        // Recebendo valores e armazenando-os em uma variável
        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = sc.nextInt();
        System.out.println("Digite o quarto valor:");
        valor4 = sc.nextInt();
        System.out.println("Digite o quinto valor:");
        valor5 = sc.nextInt();

        // Verificando qual é o maior valor
        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4 && valor1 > valor5) {
            System.out.println(valor1 + " é o maior valor");
        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4 && valor2 > valor5) {
            System.out.println(valor2 + " é o maior valor");
        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4 && valor3 > valor5) {
            System.out.println(valor3 + " é o maior valor");
        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3 && valor4 > valor5) {
            System.out.println(valor4 + " é o maior valor");
        } else {
            System.out.println(valor5 + " é o maior valor");
        }

        // Verificando qual é o menor valor
        if (valor1 < valor2 && valor1 < valor3 && valor1 < valor4 && valor1 < valor5) {
            System.out.println(valor1 + " é o menor valor");
        } else if (valor2 < valor1 && valor2 < valor3 && valor2 < valor4 && valor2 < valor5) {
            System.out.println(valor2 + " é o menor valor");
        } else if (valor3 < valor1 && valor3 < valor2 && valor3 < valor4 && valor3 < valor5) {
            System.out.println(valor3 + " é o menor valor");
        } else if (valor4 < valor1 && valor4 < valor2 && valor4 < valor3 && valor4 < valor5) {
            System.out.println(valor4 + " é o menor valor");
        } else {
            System.out.println(valor5 + " é o menor valor");
        }

        sc.close();
    }
}
