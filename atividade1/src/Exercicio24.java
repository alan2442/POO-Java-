/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo :24. Faça um programa na Linguagem  Java  que efetue a leitura de um número inteiro e apresentar uma mensagem informando 
se o número é par ou ímpar.
*
*/

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Criando variável
        int valor;

        //Recebendo um valor e armazendando-o em uma variável
        System.out.println("Digite um valor para descobrir se é impar ou par:");
        valor = sc.nextInt();

        //verificando se o valor é par ou impar
        if(valor % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é impar");
        }

        sc.close();
    }
}
