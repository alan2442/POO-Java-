/*54. Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	
Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	
Após de todos os elementos do vetor A, mostrar os dois vetores */

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio54 {

    public static void main(String args[]) {
        //Criando objeto sc
        Scanner sc = new Scanner(System.in);

        //Criando Arrays
        int[] A = new int[5];

        //Criando variável contadora
        int contadora = 0;
        


        //Criando o loop para receber os valores do Array A, calcular seu fatorial e armazenar no Array B
        for(int i = 0; i != 5; i++) {
            //Armazenando os valores no Array A
            System.out.println("Digite o "+(i+1)+" valor");
            A[i] = sc.nextInt();

            int[] B = new int[A[i]];

            contadora = A[i];

            //Criando o loop for para calcular o fatorial de cada elemento do array A
            while(contadora != 1) {
                contadora--;
                B[i] = A[i] * contadora;
                System.out.println(A[i]+" * "+contadora+" = "+B[i]);
            }

        }

        //Exibindo o vetorA
        System.out.println("Array A: "+Arrays.toString(A));



        sc.close();

    }
}