/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 07. Faça um programa na Linguagem Java que leia a idade de uma 
pessoa expressa em ano, mês e dia e mostre-as em dias. */

import java.util.Scanner;

public class Exercicio7 {
    
     public static void main(String[] args) {
        //Instanciando um objeto chamado sc
        Scanner sc = new Scanner(System.in);

        //Imprimindo perguntas sobre idade, mês atual do ano e dia atual do mês
        System.out.println("Digite quantos anos vc tem:");
        float idadeAnos = sc.nextFloat();
        System.out.println("Digite o mês atual do ano:");
        float idadeMeses = sc.nextFloat();
        System.out.println("Digite o dia atual do mês:");
        float idadeDias = sc.nextFloat();

        //Convertendo ano e meses em dias
        idadeAnos = idadeAnos * 365;
        idadeMeses = idadeMeses * 30;
        float somaDias = idadeAnos + idadeMeses + idadeDias;

        //imprimindo a quantidade de dias que você viveu
        System.out.println("O total de dias que você ja viveu é: " + somaDias);

        sc.close();

    }
}
