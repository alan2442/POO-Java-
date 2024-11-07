/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 06. Faça um programa na Linguagem Java  para calcular e apresentar o 
valor do volume de uma lata de óleo, utilizando a fórmula: 
VOLUME <-- 3.14159 * RAIO2 * ALTURA.  */

import java.util.Scanner;

import java.lang.Math;

public class Exercicio6 {

    public static void main(String args[]) {
        // Instanciando um objeto chamado sc
        Scanner sc = new Scanner(System.in);

        // Criando variáveis
        float volume, raio, altura;

        // Imprimindo as peguntas do valor do raio e da altura
        System.out.println("Digite o valor do raio:");
        raio = sc.nextFloat();
        System.out.println("Digite o valor da altura");
        altura = sc.nextFloat();

        // Calculando o valor do volume de uma lata de óleo
        volume = (3.14f * (int) Math.pow(raio, 2) * altura);

        // Imprimindo o valor do volume da late de óleo
        System.out.println("O volume da lata de óleo é: " + volume);

        sc.close();

    }
}
