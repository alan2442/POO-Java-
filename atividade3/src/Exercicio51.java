/*51. Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira 
e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.  */

import java.util.Scanner;

public class Exercicio51 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        //Criando Arrays alunos, primeirasNotas, segundasNotas e mediasAlunos
        String[] alunos = new String[5];
        float[] primeirasNotas = new float[5];
        float[] segundasNotas = new float[5]; 
        float[] mediasAlunos = new float[5];

        
        //Criando um loop for para armazenar os nomes do alunos e suas notas
        for(int i = 0; i != 5; i++) {
            //Armazenando nome dos alunos
            System.out.println("Digite o nome do aluno "+ (i+1));
            alunos[i] = sc1.nextLine();

            //Armazenando primeiras e segundas notas dos alunos
            System.out.println("Digite a primeira nota do aluno "+alunos[i]);
            primeirasNotas[i] = sc.nextFloat();
            System.out.println("Digite a segunda nota do aluno "+alunos[i]);
            segundasNotas[i] = sc.nextFloat();

            System.out.println("-------------------------------------------------------");

        }

        //Criando loop para calcular as medias dos aluno e exibir as medias
        for(int i = 0; i != 5; i++) {
            
            //Calculando as medias dos alunos
            mediasAlunos[i] = (primeirasNotas[i] + segundasNotas[i]) / 2;


            //Exibindo as medias dos alunos
            System.out.println("A media do aluno "+alunos[i]+" é igual a: "+mediasAlunos[i]);

        }



        sc.close();
        sc1.close();

    }
}
