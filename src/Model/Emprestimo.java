package Model;

public class Emprestimo {
    private Livro livro;
    private Aluno aluno;
    private boolean ativo;

    public Emprestimo(Livro livro, Aluno aluno) {
        this.livro = livro;
        this.aluno = aluno;
        this.ativo = true;
    }

    public Livro getLivro() {
        return livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void finalizar() {
        this.ativo = false;
    }
}