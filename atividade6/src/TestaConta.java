
//importando a classe Scanner
import java.util.Scanner;

public class TestaConta {

    public static class ContaCorrente {
        //Atributos da classe conta corrente
        private String nomeConta;
        private String sexo;
        private int idade;
        private int numeroConta;
        private String flag;
        private double saldo = 0;

        //Getter nomeConta
        public String getNomeConta() {
            return this.nomeConta;
        }
        
        //Setter nomeConta
        public void setNomeConta(String nomeConta) {
            this.nomeConta = nomeConta;
        }

        //Getter sexo
        public String getSexo() {
            return this.sexo;
        }

        //Setter sexo
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        //Getter idade
        public int getIdade() {
            return this.idade;
        }

        //Setter idade
        public void setIdade(int idade) {
            this.idade = idade;
        }

        //Getter numeroConta
        public int getNumeroConta() {
            return this.numeroConta;
        }

        //Setter numeroConta
        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        //Getter Flag
        public String getFlag() {
            return this.flag;
        }

        //Setter Flag
        public void setFlag(String flag) {
            this.flag = flag;
        }

        //Getter Saldo
        public double getSaldo() {
            return this.saldo;
        }

        //Setter Saldo
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        //Método Saque
        public void saque(double valor) {
            if(valor > getSaldo()) {
                System.out.println("Saldo Indisponível");
            } else {
                valor = getSaldo() - valor;
                setSaldo(valor);
            }
        }

        //Método saldo
        public void saldo() {
            System.out.println("-------------------------------------------------");
            System.out.println("Nome do Correntista: "+getNomeConta());
            System.out.println("Numero da Conta: "+getNumeroConta());
            System.out.println("Flag(Conta conjunta ou não): "+getFlag());
            System.out.println("Saldo da Conta: "+getSaldo());
            System.out.println("-------------------------------------------------");
        }

        //Metodo Deposito
        public double deposito(double valor) {
            return valor;
        }

        //Metodo Aumentar Salario
        public double aumentarSalario(double aumento) {
            aumento = getSaldo() + deposito();
        }


    }
    
    public static void main(String args[]) {
        //Criando objetos sc, sc1, conta1, conta2 e conta3
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        //Criando variáveis
        int numero = 0, numero1 = 0;

        //Recebendo valores em String e int e armazenando nos atributos da conta1
        System.out.println("Digite o nome da conta Corrente");
        conta1.setNomeConta(sc.nextLine());
        System.out.println("Digite o numero da conta Corrente");
        conta1.setNumeroConta(sc.nextInt());

        while(numero != 1 && numero != 2) {
            System.out.println("Digite o numero para indicar se a conta é conjunta: 1(NÂO) e 2(SIM)");
            numero = sc.nextInt();
            if (numero == 1) {
            conta1.setFlag("Não");
            } else if (numero == 2) {
            conta1.setFlag("Sim");
            } else {
            System.out.println("Valor digitado não corresponde a 0 ou 1, digite novamente");
            }
        }

        System.out.println("Digite o saldo da conta Corrente");
        conta1.setSaldo(sc1.nextDouble());
        
        while(numero1 != 1 && numero1 != 2) {
            System.out.println("Digite o numero para indicar seu sexo : 1(Masculino) e 2(Feminino)");
            numero1 = sc.nextInt();
            if (numero1 == 1) {
            conta1.setSexo("Masculino");
            } else if (numero1 == 2) {
            conta1.setSexo("Feminino");
            } else {
            System.out.println("Valor digitado não corresponde a 0 ou 1, digite novamente");
            }
        }

        System.out.println("Digite sua idade:");
        conta1.setIdade(sc.nextInt());

        conta1.saldo();



        System.out.println("Digite a quantidade que você deseja depositar: ");
        conta1.deposito(sc.nextDouble());

        conta1.saldo();


    }
}