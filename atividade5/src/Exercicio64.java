import java.util.Scanner;


public class Exercicio64 {

    public static class ClasseExercicio64 {
        private String nome;
        private double salarioBruto;
        private double desconto;

        //Getter Nome
        public String getNome() {
            return this.nome;
        }

        //Setter Nome
        public void setNome(String nome) {
            this.nome = nome;
        }

        //Getter salarioBruto
        public double getSalarioBruto() {
            return this.salarioBruto;
        }

        //Setter salarioBruto
        public void setSalarioBruto(double salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        //Getter desconto
        public double getDesconto() {
            return this.desconto;
        }

        //Setter desconto
        public void setDesconto(double desconto) {
            this.desconto = desconto;
        }

        //Método salario Liquido
        public double salarioLiquido(double salarioBruto, double desconto) {
            double salarioLiquido = salarioBruto - desconto;

            return salarioLiquido;
        }

        //Método aumentar Salario
        public void aumentarSalario(double porcentagem) {
            this.salarioBruto = salarioBruto + ((salarioBruto * porcentagem) / 100);
        }


    }
    
    public static void main(String args[]) {
        //Criando objeto sc e objetoExercicio64
        Scanner sc = new Scanner(System.in);
        ClasseExercicio64 objetoExercicio64 = new ClasseExercicio64();

        //Variável salarioLiquido
        double salarioLiquido = 0;

        //Recebendo nome, salário Bruto e desconto, e armazenando nos atributos do objetoExercicio64
        System.out.println("Digite o nome do funcionario:");
        objetoExercicio64.setNome(sc.nextLine());
        System.out.println("Digite o salário Bruto do funcionario:");
        objetoExercicio64.setSalarioBruto(sc.nextDouble());
        System.out.println("Digite o desconto do salário do funcionário");
        objetoExercicio64.setDesconto(sc.nextDouble());

        System.out.println("_________________________________________________________________________________");

        //usando o método salarioLiquido e armazenando na variável salarioLiquido
        salarioLiquido = objetoExercicio64.salarioLiquido(objetoExercicio64.getSalarioBruto(), objetoExercicio64.getDesconto());
        
        //Exibindo o nome do funcionário e o salário liquido
        System.out.println("dados do Funcionario: " + objetoExercicio64.getNome()+", " + salarioLiquido);

        System.out.println("_________________________________________________________________________________");

        //Perguntando quantos porcento o usuario deseja aumentar o salário do funcionario
        System.out.println("Deseja aumentar o salário em qual porcentagem?");
        objetoExercicio64.aumentarSalario(sc.nextDouble());

        System.out.println("_________________________________________________________________________________");

        //Exibindo o aumento do salário do funcionário
        System.out.println("dados do Funcionario: " + objetoExercicio64.getNome()+", " + objetoExercicio64.getSalarioBruto());



        sc.close();

    }
}
