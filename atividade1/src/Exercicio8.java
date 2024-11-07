/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 08.  Faça um programa na Linguagem Java que calcule a área da 
circunferência. */


import java.util.Scanner;

import java.lang.Math;


public class Exercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Criando variáveis
        double raio, resultado;

        //imprindo a pergunta do valor do raio 
        System.out.println("Digite o valor do raio da circuferência");
        raio = sc.nextDouble();
        
        //Calculando a área da circunferência
        resultado = 3.14 * Math.pow(raio, 2);

        
        //imprindo o resultado 
        System.out.println("O valor da área da circunferencia com o raio de "+raio+" é igual a:"+resultado);

        sc.close();
    }
}
