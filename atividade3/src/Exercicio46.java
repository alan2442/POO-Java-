/*46. Criar uma coleção na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 no vetor–	Após a inserção, somente 
após a inserção mostrar o vetor.Obs. Não efetuar a leitura de 10 elementos
* */

import java.util.Scanner;
import java.util.Arrays;

class Exercicio46 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Criando Array colecao 
        int[] colecao = new int[10];

        //Criando loop for para receber valores e armazenar no array colecao
        for(int i = 0 ; i != 10; i++) {
            System.out.println("Digite o elemento na posição "+ i);
            colecao[i] = sc.nextInt();
        }

        //Exibindo o tamnho do array colecao
        System.out.println("quantidade de elementos do Array coleção: "+colecao.length);

        //Exibindo os elementos que o array colecao tem
        System.out.println("colecao: "+ Arrays.toString(colecao));

        sc.close();

    }
}