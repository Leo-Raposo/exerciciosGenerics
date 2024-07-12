package ex05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArmazenamentoPersonagem<SuperHeroi> armazenamentoHerois = new ArmazenamentoPersonagem<>();
        ArmazenamentoPersonagem<Vilao> armazenamentoViloes = new ArmazenamentoPersonagem<>();
        ArmazenamentoPersonagem<Ajudante> armazenamentoAjudantes = new ArmazenamentoPersonagem<>();

        try {
            List<String> linhas = Files.readAllLines(Paths.get("src/ex05/personagens.txt"));
            String categoria = "";
            for (String linha : linhas) {
                if (linha.contains("Super-heróis")) {
                    categoria = "heroi";
                } else if (linha.contains("Vilões")) {
                    categoria = "vilao";
                } else if (linha.contains("Ajudantes")) {
                    categoria = "ajudante";
                } else if (!linha.trim().isEmpty()) {
                    switch (categoria) {
                        case "heroi":
                            armazenamentoHerois.adicionarPersonagem(new SuperHeroi(linha.trim()));
                            break;
                        case "vilao":
                            armazenamentoViloes.adicionarPersonagem(new Vilao(linha.trim()));
                            break;
                        case "ajudante":
                            armazenamentoAjudantes.adicionarPersonagem(new Ajudante(linha.trim()));
                            break;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("Super-heróis:");
        for (SuperHeroi heroi : armazenamentoHerois.getPersonagens()) {
            System.out.println(heroi.getNome());
        }

        System.out.println("\nVilões:");
        for (Vilao vilao : armazenamentoViloes.getPersonagens()) {
            System.out.println(vilao.getNome());
        }

        System.out.println("\nAjudantes:");
        for (Ajudante ajudante : armazenamentoAjudantes.getPersonagens()) {
            System.out.println(ajudante.getNome());
        }
    }
}
