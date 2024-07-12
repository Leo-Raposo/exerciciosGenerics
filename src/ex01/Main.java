package ex01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Fila<String> filaPersonagens = new Fila<>();
        filaPersonagens.enfileirar("Finn");
        filaPersonagens.enfileirar("Jake");
        filaPersonagens.enfileirar("Princesa Jujuba");

        System.out.println("Primeiro da fila: " + filaPersonagens.primeiro());
        System.out.println("Desenfileirando: " + filaPersonagens.desenfileirar());
        System.out.println("Primeiro da fila: " + filaPersonagens.primeiro());

        AnalisadorDeDados<String> analisador = new AnalisadorDeDados<>();
        try {
            analisador.carregarDados("src/ex01/personagens.txt", linha -> linha);
            System.out.println("Dados carregados: " + analisador.getDados());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
