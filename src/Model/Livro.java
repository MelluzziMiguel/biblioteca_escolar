package Model;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidade;

    public Livro(String titulo, String autor, int quantidade) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
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

    public boolean temDisponivel() {
        return quantidade > 0;
    }

    public void diminuirQuantidade() {
        quantidade--;
    }

    public void aumentarQuantidade() {
        quantidade++;
    }
}