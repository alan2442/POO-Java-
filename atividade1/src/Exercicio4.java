/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 04. Faça um programa na Linguagem Java que leia uma temperatura em 
graus Celsius e apresentá-la convertida em graus Fahrenheit. A 
fórmula de conversão é F <-- (9 * C + 160) /5, sendo f a temperatura 
em Fahrenheit e C a temperatura em Celsius. */

import java.util.Scanner;

public class Exercicio4 {

    //Método de Saida 
	static void saida(String mensagem) {
		System.out.println(mensagem);
	}

	public static void main(String[] args) {
		//Criando variáveis
		int grauC;
		int grauF; 

		Scanner sc = new Scanner(System.in);
		
		//Imprimindo a pergunta do valor de Graus em Celsius e armazenando em uma variável
		saida("Digite o valor em Graus Celsius para convertem em graus Fahrenheit");
		grauC = sc.nextInt();
		
		//Convertendo GrauC para GrauF
		grauF = (9 * grauC + 160) / 5;
		
		//Imprimindo o valor da conversão
		saida("Os " + grauC + " graus Célsius convertido para Fahrenheit é " + grauF + " graus Fahrenheit");

		sc.close();
	}
}
