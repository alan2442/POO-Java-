public class ClasseExercicio1 {
    // Criando atributos
    private int numeroConta;
    private String nomeCliente;
    private int cpf;
    private float saldoConta, valorParaSacar = 0;
    private int resposta = 0;

    //Getters e Setters do atributo numeroConta
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //Getters e Setters do atributo nomeCliente
    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //Getters e Setters do atributo cpf
    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    //Getters e Setters do atributo saldoConta
    public float getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    //Getters e Setters do atributo valorParaSacar
    public float getValorParaSacar() {
        return this.valorParaSacar;
    }

    public void setValorParaSacar(float valorParaSacar) {
        this.valorParaSacar = valorParaSacar;
    }

    //Getters e Setters do atributo resposta
    public int getResposta() {
        return this.resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    




    /*
     * Metodo de sacarDinheiro que calcula se o cliente tem dinheiro suficiente para
     * Sacar
     */
    public void sacarDinheiro(float valorParaSacar, float saldoConta) {
        if (valorParaSacar <= saldoConta) {
            saldoConta -= valorParaSacar;
            System.out.println("Retire seu cartão e pegue seu dinheiro");
            System.out.println("O saldo atual agora é " + saldoConta);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    } // Fim metodo SacarDinheiro

    // Metodo Habilitar Pix
    public void habilitarPix() {
        System.out.println("Pix Habilitado com sucesso");
    }// Fim do Metodo Habilitar Pix
}
