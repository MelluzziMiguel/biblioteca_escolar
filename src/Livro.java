public class Livro {
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(String titulo, String autor, int quantidade) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void emprestar() {
        if (quantidade <= 0) {
            throw new IllegalStateException("Livro indisponível para empréstimo.");
        }
        quantidade--;
    }

    public void devolver() {
        quantidade++;
    }
}