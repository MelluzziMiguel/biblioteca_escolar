package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Aluno;
import Model.Emprestimo;
import Model.Livro;

public class BibliotecaController {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Emprestimo realizarEmprestimo(Livro livro, Aluno aluno) {
        if (!livro.temDisponivel()) {
            throw new IllegalStateException("Livro sem estoque.");
        }

        livro.diminuirQuantidade();

        Emprestimo emprestimo = new Emprestimo(livro, aluno);
        emprestimos.add(emprestimo);

        return emprestimo;
    }

    public void devolverLivro(Emprestimo emprestimo) {
        if (!emprestimo.isAtivo()) {
            throw new IllegalStateException("Empréstimo já finalizado.");
        }

        emprestimo.getLivro().aumentarQuantidade();
        emprestimo.finalizar();
    }

    public List<Emprestimo> listarEmprestimosAtivos() {
        List<Emprestimo> ativos = new ArrayList<>();

        for (Emprestimo e : emprestimos) {
            if (e.isAtivo()) {
                ativos.add(e);
            }
        }

        return ativos;
    }
}