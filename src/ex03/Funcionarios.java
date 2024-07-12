package ex03;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios<T> {
    private List<T> funcionarios;

    public Funcionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        funcionarios.remove(funcionario);
    }

    public List<T> listarFuncionarios() {
        return funcionarios;
    }

    public void exibirInformacoes() {
        for (T funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}
