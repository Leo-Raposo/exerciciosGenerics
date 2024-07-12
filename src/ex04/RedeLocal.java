package ex04;

public class RedeLocal extends ComponenteGenerico<String> {
    public RedeLocal(String componente) {
        super(componente);
    }

    @Override
    public void simular() {
        System.out.println("Simulando rede local com componente: " + getComponente());
    }
}
