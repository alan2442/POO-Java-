/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 11. Faça um programa na Linguagem Java  para ler dois valores inteiros 
para as variáveis A e B e efetuar a troca dos valores de forma que a 
variável A passe a possuir o valor da variável B e a variável B passe 
a possuir o valor da variável A. Apresentar os valores trocados. */

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String args[]) {
        //Instanciando objeto chamado sc
        Scanner sc = new Scanner(System.in);

        //Criando variáveis
        int valorA, valorB, guardaValor;

        //Perguntando os valores
        System.out.println("Digite o valor de A");
        valorA = sc.nextInt();
        System.out.println("Digite o valor de B");
        valorB = sc.nextInt();

        // Trocando valores
        guardaValor = valorA;
        valorA = valorB;
        valorB = guardaValor;

        // Mostrando os valores
        System.out.println("O valor A recebeu o valor B e ficou: "+valorA);
        System.out.println("O valor B recebeu o valor A e ficou: "+valorB);

        sc.close();
    }
}
