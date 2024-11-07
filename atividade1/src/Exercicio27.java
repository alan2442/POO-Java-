/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo :27. O cardápio de uma lanchonete é o seguinte:

Especificação          Código           Preço

Cachorro quente        100              1,20

Bauru simples          101              1,30

Bauru com ovo          102              1,50

Hambúrger              103              1,20

Cheeseburguer          104              1,30

Refrigerante           105              1,00

Faça um programa na Linguagem Java que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche. 
Considere que a cada execução somente será calculado um item.
*
*/

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String args[]) {
        // instanciando objeto chamado Scanner
        Scanner sc = new Scanner(System.in);

        // Criando variáveis
        int codigo = 0, quantidade = 0;
        Double valorPagamento;

        // Criando Arrays especificações, codigos, precos
        String[] especificacoes = { "Cachorro quente", "Bauru Simples", "Bauru com ovo", "Hambúrger", "Cheeseburguer",
                "Refrigerante" };
        int[] codigos = { 100, 101, 102, 103, 104, 105 };
        Double[] precos = { 1.20, 1.30, 1.50, 1.20, 1.30, 1.00 };

        // armazenando informações de codigo e quantidade em variáveis
        while (codigo < 100 || codigo > 105) {
            System.out.println("Digite o código do alimento que você vai querer:");
            codigo = sc.nextInt();
            System.out.println("Digite a quantidade que você vai querer:");
            quantidade = sc.nextInt();

            // Verificando se o código digitado é válido
            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido, digite novamente código e aquantidade que você quer");
            }
        }

        // verificando o código escolhido, sua especificação e calculando o preço a ser
        // pago e imprimindo na tela
        if (codigo == 100) {
            System.out.println("Você escolheu o codigo " + codigos[0]);
            System.out.println("Você escolheu o " + especificacoes[0] + " que custa R$" + precos[0]
                    + ", Sendo " + quantidade + " a quantidade(s)");
            valorPagamento = precos[0] * quantidade;
            System.out.println("O valor que o cliente vai pagar é: " + valorPagamento);
        } else if (codigo == 101) {
            System.out.println("Você escolheu o codigo " + codigos[1]);
            System.out.println("Você escolheu o " + especificacoes[1] + " que custa R$" + precos[1]
                    + ", Sendo " + quantidade + " a quantidade(s)");
            valorPagamento = precos[1] * quantidade;
            System.out.println("O valor que o cliente vai pagar é: " + valorPagamento);
        } else if (codigo == 102) {
            System.out.println("Você escolheu o codigo " + codigos[2]);
            System.out.println("Você escolheu o " + especificacoes[2] + " que custa R$" + precos[2]
                    + ", Sendo " + quantidade + " a quantidade(s)");
            valorPagamento = precos[2] * quantidade;
            System.out.println("O valor que o cliente vai pagar é: " + valorPagamento);
        } else if (codigo == 103) {
            System.out.println("Você escolheu o codigo " + codigos[3]);
            System.out.println("Você escolheu o " + especificacoes[3] + " que custa R$" + precos[3]
                    + ", Sendo " + quantidade + " a quantidade(s)");
            valorPagamento = precos[3] * quantidade;
            System.out.println("O valor que o cliente vai pagar é: " + valorPagamento);
        } else if (codigo == 104) {
            System.out.println("Você escolheu o codigo " + codigos[4]);
            System.out.println("Você escolheu o " + especificacoes[4] + " que custa R$" + precos[4]
                    + ", Sendo " + quantidade + " a quantidade(s)");
            valorPagamento = precos[4] * quantidade;
            System.out.println("O valor que o cliente vai pagar é: " + valorPagamento);
        } else {
            System.out.println("Você escolheu o codigo " + codigos[5]);
            System.out.println("Você escolheu o " + especificacoes[5] + " que custa R$" + precos[5]
                    + ", Sendo " + quantidade + " a quantidade(s)");
            valorPagamento = precos[5] * quantidade;
            System.out.println("O valor que o cliente vai pagar é: " + valorPagamento);
        }

        sc.close();

    }
}
