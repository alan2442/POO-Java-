/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo : 31. Faça um programa na Linguagem Java que que receba um número e mostre 
o fatorial desse número. 
*
*/

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Criando variáveis
        int valor, fatorial = 0, contadora = 1;

        // Recebendo um valor para saber o fatorial
        System.out.println("Digite um valor para saber o seu fatorial:");
        valor = sc.nextInt();

        // contadora recebe o valor da variável valor
        contadora = valor;

        // Calculando o fatorial
        while (contadora != 1) {
            contadora--;
            fatorial = valor * contadora;
            System.out.println(valor + " * " + contadora + " = " + fatorial);
            valor = fatorial;

        }

        // Imprimindo o fatoiral
        System.out.println("O fatorial é: " + fatorial);

        sc.close();
    }
}
