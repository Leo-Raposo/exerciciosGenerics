package ex03;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionarios<Personagem> funcionarios = new Funcionarios<>();

        Personagem finn = new Personagem("Finn", "Herói");
        Personagem jake = new Personagem("Jake", "Cachorro Mágico");
        Personagem princesaBubblegum = new Personagem("Princesa Bubblegum", "Cientista");

        funcionarios.adicionarFuncionario(finn);
        funcionarios.adicionarFuncionario(jake);
        funcionarios.adicionarFuncionario(princesaBubblegum);

        funcionarios.exibirInformacoes();

        AnalisadorDados<Personagem> analisador = new AnalisadorDados<>();
        analisador.analisarArquivo("src/ex03/personagens.txt", new PersonagemParser());

        List<Personagem> personagensAnalisados = analisador.getDados();
        for (Personagem p : personagensAnalisados) {
            System.out.println(p);
        }
    }
}
