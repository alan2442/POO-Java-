/*Nome: Alan Nogueira da Silva
RA: 2171392321020
Objetivo: 10. Faça um programa na Linguagem Java que efetue a apresentação 
do valor da conversão em real de um valor lido em dólar. O programa 
deve solicitar o valor da cotação do dólar e também a quantidade de 
dólares disponível com o usuário, para que seja apresentado o valor 
em moeda brasileira.  */

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String args[]) {
        // Instanciando um objeto chamado sc
        Scanner sc = new Scanner(System.in);

        // Criando variáveis
        float dollar, cotacaoDollar, real;

        /*
         * Imprimindo perguntas da cotação do dollar e dollares que deseja ser
         * convertido
         * e armazenando em variáveis
         */
        System.out.println("Digite o valor da cotação do dollar: ");
        cotacaoDollar = sc.nextFloat();
        System.out.println("Digite o valor em dollar que você deseja converter para a moeda real:");
        dollar = sc.nextFloat();

        // Convertendo dollar para real
        real = dollar * cotacaoDollar;

        // Imprindo o valor da conversão
        System.out.println("O valor de " + dollar + " dóllares convertido para reais é: " + real + " reais");

        sc.close();
    }
}
