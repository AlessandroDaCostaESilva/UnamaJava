package projetoEscola;

public class Aluno {
    public String nome;
    public int matricula;
    private String cpf;

    public Aluno(String nome, int matricula, String cpf){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public void realizarCadastroAluno(){
        System.out.println("AAAAAAAA");
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public Aluno(String cpf){
        this.cpf = cpf;
    }
}
