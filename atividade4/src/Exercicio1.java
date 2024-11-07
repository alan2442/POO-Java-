import java.util.Scanner;

public class Exercicio1 {

    
    // Metodo Main
    public static void main(String args[]) {
        // Instanciando objetos chamados sc, sc1 e objetoExercicio1
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ClasseExercicio1 objetoExercicio1 = new ClasseExercicio1();


        // Recebendo valores e armazenando em variáveis
        System.out.println("Digite o numero da Conta");
        objetoExercicio1.setNumeroConta(sc.nextInt());
        System.out.println("Digite o nome do Cliente");
        objetoExercicio1.setNomeCliente(sc1.nextLine());
        System.out.println("Digite o numero do cpf do cliente");
        objetoExercicio1.setCpf(sc.nextInt()); 
        System.out.println("Digite o saldo da Conta");
        objetoExercicio1.setSaldoConta(sc.nextFloat());
        System.out.println(
                "_________________________________________________________________________________________________");

        // Imprimindo na tela o nome do cliente, nome da conta, cpf e saldo da conta
        System.out.println("Nome do cliente: " + objetoExercicio1.getNomeCliente());
        System.out.println("Numero da conta: " + objetoExercicio1.getNumeroConta());
        System.out.println("Cpf do cliente: " + objetoExercicio1.getCpf());
        System.out.println("Saldo da conta: " + objetoExercicio1.getSaldoConta());

        System.out.println(
                "_________________________________________________________________________________________________");
        // Criando um while onde pergunto a operação que o cliente deseja realizar,
        // sacar ou habilitar pix
        while (objetoExercicio1.getResposta() != 1 && objetoExercicio1.getResposta() != 2) {
            System.out.println("Digite 1 para sacar dinheiro ou 2 para habilitar o pix");
            objetoExercicio1.setResposta(sc.nextInt());

            if (objetoExercicio1.getResposta() == 1) {
                System.out.println("Digite o valor que deseja sacar");
                objetoExercicio1.setValorParaSacar(sc.nextFloat());
                objetoExercicio1.sacarDinheiro(objetoExercicio1.getValorParaSacar(), objetoExercicio1.getSaldoConta());
            } else if (objetoExercicio1.getResposta() == 2) {
                objetoExercicio1.habilitarPix();
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
