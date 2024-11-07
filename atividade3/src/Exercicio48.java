/*48. Criar uma coleção “A” na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 na coleção–	Criar uma outra
 coleção B que conterá o elemento da coleção A multiplicado por 2–	Mostrar as duas coleçõesObs. Não efetuar a leitura de 10 
 elementos
*  */

import java.util.Scanner;
import java.util.Arrays;


public class Exercicio48 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Criando Arrays colecao A e B
        int[] colecaoA = new int[10];
        int[] colecaoB = new int[10];

        //Criando Loop for para receber os elementos e armazenar nos arrays colecao A e B
        for(int i = 0 ; i != 10; i++) {
            System.out.println("Digite o elemento na posição "+ i);
            colecaoA[i] = sc.nextInt();
            colecaoB[i] = colecaoA[i] * 2;
            /*System.out.println(colecaoB[i]);*/
        }

        
        //Exibindo os tamanhos dos Arrays colecao A e B
        System.out.println("quantidade de elementos do Array coleçãoA: "+colecaoA.length);
        System.out.println("quantidade de elementos do Array coleçãoB: "+colecaoA.length);

        //Exibindo o que os Arrays colecao A e B possuem
        System.out.println("colecaoA: "+Arrays.toString(colecaoA));
        System.out.println("colecaoB: "+Arrays.toString(colecaoB));
        

        sc.close();
    }
}
