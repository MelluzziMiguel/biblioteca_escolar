public class Emprestimo {
    private Livro livro;
    private Aluno aluno;
    private boolean ativo;

    public Emprestimo(Livro livro, Aluno aluno) {
        this.livro = livro;
        this.aluno = aluno;
        this.ativo = true;

        livro.emprestar();
    }

    public void devolver() {
        if (!ativo) {
            throw new IllegalStateException("Empréstimo já finalizado.");
        }

        livro.devolver();
        ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getDescricao() {
        return "Livro: " + livro.getTitulo() +
                " | Aluno: " + aluno.getNome() +
                " | Ativo: " + ativo;
    }
}