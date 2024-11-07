/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo : 22. Faça um programa na Linguagem  Java  que leia 3 números inteiros e mostre o maior deles.*/

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Criando variáveis dos valores
        int valor1, valor2, valor3;

        // Recebendo valores e armazenando nas variáveis
        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        valor3 = sc.nextInt();

        // Verificando qual é o maior número digita e imprimindo na tela
        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println(valor1 + " é o maior valor");
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println(valor2 + " é o maior valor");
        } else {
            System.out.println(valor3 + " é o maior valor");
        }

        sc.close();

    }
}
