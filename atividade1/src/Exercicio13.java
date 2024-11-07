/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 13. Faça um programa na Linguagem Java que receba um número e 
mostre o resto da divisão por 6. */

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String args[]) {
        //instanciando um objeto chamado sc
        Scanner sc = new Scanner(System.in);

        //Criando variável
        int valor;

        //Perguntando e armazendo o valor em uma variável
        System.out.println("Digite um valor para saber o resta da divisão dele divido por 6");
        valor = sc.nextInt();

        //Resto da divisão por 6
        valor = valor % 6;

        //Mostrando o resto da divisão por 6 do valor
        System.out.println("O resto da divisão é: "+valor);


        sc.close();
    }
}
