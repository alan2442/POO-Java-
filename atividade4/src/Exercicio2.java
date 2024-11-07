
//Importando a classe Scanner
import java.util.Scanner;

public class Exercicio2 {

    // Criando Metodo Main
    public static void main(String args[]) {
        // Criando objetos sc, sc1 e objetoExercicio2
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ClasseExercicio2 objetoExercicio2 = new ClasseExercicio2();

        // Recebendo valores de RA, nome, endereço e curso e armazenando em variáveis
        System.out.println("Digite o RA do aluno");
        objetoExercicio2.setRa(sc.nextInt());
        System.out.println("Digite o nome do aluno");
        objetoExercicio2.setNome(sc1.nextLine());
        System.out.println("Digite o endereço do aluno");
        objetoExercicio2.setEndereco(sc1.nextLine());
        System.out.println("Digite o curso do aluno");
        objetoExercicio2.setCurso(sc1.nextLine());

        System.out.println(
                "_________________________________________________________________________________________________");

        // Imprimindo na tela os valores de RA, Nome, Endereço e Curso do aluno
        System.out.println("RA do aluno: " + objetoExercicio2.getRa());
        System.out.println("Nome do aluno: " + objetoExercicio2.getNome());
        System.out.println("Endereço do aluno: " + objetoExercicio2.getEndereco());
        System.out.println("Curso do aluno: " + objetoExercicio2.getCurso());

        System.out.println(
                "_________________________________________________________________________________________________");

        /*
         * Criando um loop While para perguntar se o usuario deseja visualizar a carga
         * horaria ou a quantidade de semestres do curso
         */
        while (objetoExercicio2.getResposta() != 1 && objetoExercicio2.getResposta() != 2) {
            System.out.println(
                    "Digite 1 visualizar a carga horária do curso e 2 para visualizar a quantidade de semestre");
            objetoExercicio2.setResposta(sc.nextInt());

            if (objetoExercicio2.getResposta() == 1) {
                objetoExercicio2.cargaHoraria();
            } else if (objetoExercicio2.getResposta() == 2) {
                objetoExercicio2.qtdSemestres();
            } else {
                System.out.println(
                        "_________________________________________________________________________________________________");
                System.out.println("Numero digitado não corresponde a nenhum numero de operação disponível");
                System.out.println("Digite o número novamente");
            }
        }

        sc.close();
        sc1.close();
    }
}
