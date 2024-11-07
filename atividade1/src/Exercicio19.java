/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo : 19. Faça um programa na Linguagem Java que leia quatros valores referentes a 
quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o 
aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno 
não foi aprovado, indicar uma mensagem informando esta condição. Apresentar 
junto das mensagens o valor da média do aluno para qualquer condição. 
*/

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String args[]) {
        // Instanciando um objeto chamado sc
        Scanner sc = new Scanner(System.in);

        // Criando variáveis
        String aluno;
        double nota1, nota2, nota3, nota4, valorMedia;

        // Recebendo notas e armazenando nas variáveis
        System.out.println("Digite o nome do aluno:");
        aluno = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno:");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota do aluno:");
        nota4 = sc.nextDouble();

        // Calculando a média da nota
        valorMedia = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificando se o aluno foi aprovado ou Reprovado
        if (valorMedia >= 7) {
            System.out.println(aluno + " foi aluno Aprovado");
        } else {
            System.out.println(aluno + " foi aluno Reprovado");
        }

        sc.close();
    }
}
