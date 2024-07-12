package ex03;

public class Personagem {
    private String nome;
    private String funcao;

    public Personagem(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
