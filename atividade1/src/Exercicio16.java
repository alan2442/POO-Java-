//Nome: Alan Nogueira da Silva
//RA: 2171392321020
//Objetivo : 16. Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.

// importando a classe Scanner
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String args[]) {
        // instanciando um objeto(criando) Scanner chamado sc
        Scanner sc = new Scanner(System.in);

        // Criando variáveis
        int valor1, valor2, valor3;

        // Recebendo valores e armazenando em variáveis
        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segunda valor:");
        valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = sc.nextInt();

        // Verificando qual é são os menores valores
        if (valor1 < valor2 && valor1 < valor3 && valor2 < valor3) {
            System.out.println(valor1 + " " + valor2 + " " + valor3);
        } else if (valor1 < valor2 && valor1 < valor3 && valor3 < valor2) {
            System.out.println(valor1 + " " + valor3 + " " + valor2);
        } else if (valor2 < valor1 && valor2 < valor3 && valor1 < valor3) {
            System.out.println(valor2 + " " + valor1 + " " + valor3);
        } else if (valor2 < valor1 && valor2 < valor3 && valor3 < valor1) {
            System.out.println(valor2 + " " + valor3 + " " + valor1);
        } else if (valor3 < valor1 && valor3 < valor2 && valor1 < valor2) {
            System.out.println(valor3 + " " + valor1 + " " + valor2);
        } else {
            System.out.println(valor3 + " " + valor2 + " " + valor1);
        }

        sc.close();

    }
}
