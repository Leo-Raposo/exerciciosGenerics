package ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AnalisadorDadosGenerico<T> {
    private T dados;

    public AnalisadorDadosGenerico(T dados) {
        this.dados = dados;
    }

    public T getDados() {
        return dados;
    }

    public void setDados(T dados) {
        this.dados = dados;
    }

    public void analisar() {
        if (dados instanceof String) {
            try (BufferedReader br = new BufferedReader(new FileReader((String) dados))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    System.out.println("Analisando linha: " + linha);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Tipo de dado não suportado.");
        }
    }
}
