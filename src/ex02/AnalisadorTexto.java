package ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AnalisadorTexto implements AnalisadorDados<String> {
    private List<String> dadosProcessados;

    @Override
    public void processarDados(List<String> dados) {
        this.dadosProcessados = dados;
    }

    public void processarArquivo(String caminhoArquivo) throws IOException {
        Path path = Paths.get(caminhoArquivo);
        this.dadosProcessados = Files.readAllLines(path);
    }

    @Override
    public void extrairInformacoesRelevantes() {
        if (dadosProcessados != null) {
            System.out.println("Número de linhas: " + dadosProcessados.size());
        } else {
            System.out.println("Nenhum dado processado.");
        }
    }

    @Override
    public void exibirResultados() {
        if (dadosProcessados != null) {
            System.out.println("Dados processados:");
            for (String linha : dadosProcessados) {
                System.out.println(linha);
            }
        } else {
            System.out.println("Nenhum dado processado.");
        }
    }
}
