import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 2);
        Aluno aluno = new Aluno("Miguel");

        List<Emprestimo> emprestimos = new ArrayList<>();

        Emprestimo e1 = new Emprestimo(livro, aluno);
        emprestimos.add(e1);

        System.out.println("Empréstimo realizado!");
        System.out.println(e1.getDescricao());

        Emprestimo e2 = new Emprestimo(livro, aluno);
        emprestimos.add(e2);

        System.out.println("Segundo empréstimo realizado!");
        System.out.println(e2.getDescricao());

        try {
            Emprestimo e3 = new Emprestimo(livro, aluno);
            emprestimos.add(e3);
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        e1.devolver();
        System.out.println("Livro devolvido!");

        System.out.println("\nEmpréstimos ativos:");
        for (Emprestimo e : emprestimos) {
            if (e.isAtivo()) {
                System.out.println(e.getDescricao());
            }
        }
    }
}