/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 12. Faça um programa na Linguagem Java para efetuar a leitura de um 
número inteiro e apresentar o resultado do quadrado desse número. */

import java.util.Scanner;

import java.lang.Math
;

public class Exercicio12 {

    public static void main(String args[]) {

    //Instanciando um objeto chamado sc do tipo Scanner
    Scanner sc = new Scanner(System.in);

    //Criando variável
    int valor, potencia;

    //Pergutando um valor
    System.out.println("Digite um valor para transformálo ao quadrado:");
    valor = sc.nextInt();

    //Convertendo valor ao quadrado
    potencia = (int) Math.pow(valor, 2);

    //Mostrando valor ao quadrado
    System.out.println("O valor "+valor+" ao quadrado é igual a: "+potencia);   
    
    sc.close();


    }
}
