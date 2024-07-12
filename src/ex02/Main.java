package ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/ex02/aventuras.txt";

        if (Files.exists(Paths.get(caminhoArquivo))) {
            AnalisadorTexto analisadorTexto = new AnalisadorTexto();
            try {
                analisadorTexto.processarArquivo(caminhoArquivo);
                analisadorTexto.extrairInformacoesRelevantes();
                analisadorTexto.exibirResultados();
            } catch (IOException e) {
                System.out.println("Erro ao processar o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
    }
}
