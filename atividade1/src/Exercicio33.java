/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo : 33. Faça um programa na Linguagem Java para apresentar o total da soma 
obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100). 
*
*/

public class Exercicio33 {

    public static void main(String args[]) {
        // Criando variáveis
        int contadora = 1, resultado = 2;

        // Somando os números
        while (contadora != 100) {
            resultado = contadora + resultado;
            System.out.println("O resultado é: " + resultado);
            contadora++;
            resultado++;
        }

    }
}
