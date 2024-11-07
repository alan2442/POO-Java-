/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 04. Faça um programa na Linguagem Java que leia uma temperatura em 
graus Celsius e apresentá-la convertida em graus Fahrenheit. A 
fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura 
em Fahrenheit e C a temperatura em Celsius. */

import java.util.Scanner;

public class Exercicio5 {
    // Método de Saida
    static void saida(String mensagem) {
        System.out.println(mensagem);
    }

    public static void main(String args[]) {
        // Instânciando um objeto chamadado sc
        Scanner sc = new Scanner(System.in);

        // Criando Varáveis
        int grauF;
        int grauC;

        // Imprindo a pergunta do valor em grauF e armazenando em uma variável
        saida("Digite um valor de uma temperatura em graus Fahrenheit para converter em CelsiuS");
        grauF = sc.nextInt();

        // Convertendo o valor em grauF para grauC e imprimindo a conversão na tela.
        grauC = (grauF - 32) * 5 / 9;
        saida("O valor de " + grauF + " graus Fahrenheit convertido para Celsius é " + grauC + " graus Celsius");

        sc.close();

    }
}
