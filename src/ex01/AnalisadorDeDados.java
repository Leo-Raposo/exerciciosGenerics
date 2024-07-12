package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalisadorDeDados<T> {
    private List<T> dados;

    public AnalisadorDeDados() {
        dados = new ArrayList<>();
    }

    public void carregarDados(String caminhoArquivo, Parser<T> parser) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                T dado = parser.parse(linha);
                dados.add(dado);
            }
        }
    }

    public List<T> getDados() {
        return dados;
    }

    public interface Parser<T> {
        T parse(String linha);
    }
}
