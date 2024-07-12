package ex05;

import java.util.ArrayList;
import java.util.List;

public class ArmazenamentoPersonagem<T extends Personagem> {
    private List<T> personagens = new ArrayList<>();

    public void adicionarPersonagem(T personagem) {
        personagens.add(personagem);
    }

    public List<T> getPersonagens() {
        return personagens;
    }
}
