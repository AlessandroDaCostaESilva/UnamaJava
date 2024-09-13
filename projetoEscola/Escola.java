package projetoEscola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno2 = new Aluno("Arnaldo", 1550, "909.888.112-85");
        System.out.println(aluno2.nome);
        System.out.println(aluno2.matricula);
        System.out.println(aluno2.getCpf());
        aluno2.realizarCadastroAluno();
    }
}
