package ex02;

import java.util.ArrayList;
import java.util.List;

public class Familia<T> {
    private List<T> membros;

    public Familia() {
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(T membro) {
        membros.add(membro);
    }

    public void removerMembro(T membro) {
        membros.remove(membro);
    }

    public List<T> listarMembros() {
        return new ArrayList<>(membros);
    }
}
