package ex02;

import java.util.List;

public interface AnalisadorDados<T> {
    void processarDados(List<T> dados);
    void extrairInformacoesRelevantes();
    void exibirResultados();
}
