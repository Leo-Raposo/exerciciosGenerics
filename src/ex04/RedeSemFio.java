package ex04;

public class RedeSemFio extends ComponenteGenerico<String> {
    public RedeSemFio(String componente) {
        super(componente);
    }

    @Override
    public void simular() {
        System.out.println("Simulando rede sem fio com componente: " + getComponente());
    }
}
