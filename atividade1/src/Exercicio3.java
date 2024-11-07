/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 03. Faça um programa na Linguagem Java que receba 2 números e 
apresente a multiplicação dos dois números.  */

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Criando variáveis
        int valor1, valor2, resultado;

        //Imprimindo na tela as perguntas
        System.out.println("Digite o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = sc.nextInt();

        //Fazendo a multiplicação
        resultado = valor1 * valor2;

        //Imprimindo o resultado
        System.out.println("O resultado de "+valor1+" multiplicador por "+valor2+" é igual a: "+resultado);

        sc.close();
    }
    

   
}
