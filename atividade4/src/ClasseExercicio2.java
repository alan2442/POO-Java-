public class ClasseExercicio2 {
    // Criando atributos
    private int ra, resposta = 0;
    private String nome, endereco, curso;

    // Getters e Setters do atributo RA
    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    // Getters e Setters do atributo resposta
    public int getResposta() {
        return this.resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    // Getters e Setters do atributo nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters e Setters do atributo endereco
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getters e Setters do atributo curso
    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



    //Metodo para visualizar a Carga Horária
    public void cargaHoraria() {
        System.out.println("A carga horária é de 1500 horas");
    }

    //Metodo para visualizar a quantidade de semestres
    public void qtdSemestres() {
        System.out.println("O curso possui 3 semestres");
    }

}