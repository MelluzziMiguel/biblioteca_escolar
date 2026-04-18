package View;

import Controller.BibliotecaController;
import Model.Aluno;
import Model.Emprestimo;
import Model.Livro;

public class Main {

    public static void mostrarEmprestimo(Emprestimo e) {
        System.out.println(
                "Livro: " + e.getLivro().getTitulo() +
                        " | Aluno: " + e.getAluno().getNome() +
                        " | Ativo: " + e.isAtivo()
        );
    }

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 2);
        Aluno aluno = new Aluno("Miguel");

        BibliotecaController controller = new BibliotecaController();

        try {
            Emprestimo e1 = controller.realizarEmprestimo(livro, aluno);
            mostrarEmprestimo(e1);

            Emprestimo e2 = controller.realizarEmprestimo(livro, aluno);
            mostrarEmprestimo(e2);

            controller.realizarEmprestimo(livro, aluno);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        controller.devolverLivro(controller.listarEmprestimosAtivos().get(0));

        System.out.println("\nEmpréstimos ativos:");
        for (Emprestimo e : controller.listarEmprestimosAtivos()) {
            mostrarEmprestimo(e);
        }
    }
}