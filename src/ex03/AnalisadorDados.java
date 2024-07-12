package ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnalisadorDados<T> {
    private List<T> dados;

    public AnalisadorDados() {
        this.dados = new ArrayList<>();
    }

    public void analisarArquivo(String caminhoArquivo, Parser<T> parser) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                T dado = parser.parse(linha);
                dados.add(dado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> getDados() {
        return dados;
    }
}
