package ex04;

public class RedeWAN extends ComponenteGenerico<String> {
    public RedeWAN(String componente) {
        super(componente);
    }

    @Override
    public void simular() {
        System.out.println("Simulando rede WAN com componente: " + getComponente());
    }
}
