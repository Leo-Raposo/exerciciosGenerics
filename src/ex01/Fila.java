package ex01;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Fila<T> {
    private LinkedList<T> elementos;

    public Fila() {
        elementos = new LinkedList<>();
    }

    public void enfileirar(T elemento) {
        elementos.addLast(elemento);
    }

    public T desenfileirar() {
        if (estaVazia()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        return elementos.removeFirst();
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }

    public T primeiro() {
        if (estaVazia()) {
            throw new NoSuchElementException("A fila está vazia.");
        }
        return elementos.getFirst();
    }
}
