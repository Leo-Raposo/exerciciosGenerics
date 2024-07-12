package ex05;

import java.io.IOException;

public interface AnalisadorDados<T> {
    void analisarDados(String caminhoArquivo) throws IOException;
    T getResultado();
}
