package ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AnalisadorArquivo<T> implements AnalisadorDados<T> {
    private T resultado;

    @Override
    public void analisarDados(String caminhoArquivo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                resultado = (T) linha;
            }
        }
    }

    @Override
    public T getResultado() {
        return resultado;
    }
}
