package Model;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}