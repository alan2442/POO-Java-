/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 09. Faça um programa na Linguagem Java para efetuar o cálculo e a 
apresentação do valor de uma prestação em atraso, utilizando a 
fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * 
TEMPO).  */

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String args[]) {
        // Criando variáveis
        float prestacao, valor, taxa, tempo;

        // Instanciando um objeto Scanner chamado sc
        Scanner sc = new Scanner(System.in);

        System.out.println("Efetuar o cálculo e a apresentação do valor de uma prestação em atraso");

        // Imprindo perguntas sobre o valor da prestação, % da taxa de juros e tempo de
        // atraso
        System.out.println("Digite o valor da prestação:");
        valor = sc.nextFloat();
        System.out.println("Digite a porcentagem da taxa de juros:");
        taxa = sc.nextFloat();
        System.out.println("Digite o tempo de meses em atraso:");
        tempo = sc.nextFloat();

        // Calculando o valor das prestações em atraso
        prestacao = valor + (valor * (taxa/100)) * tempo;

        // Imprimindo o valor das prestações em atraso
        System.out.println("O valor da prestação com a taxa é: " + prestacao);

        sc.close();

    }
}
