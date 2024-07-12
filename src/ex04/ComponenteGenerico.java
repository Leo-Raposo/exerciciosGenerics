package ex04;
public class ComponenteGenerico<T> {
    private T componente;

    public ComponenteGenerico(T componente) {
        this.componente = componente;
    }

    public T getComponente() {
        return componente;
    }

    public void setComponente(T componente) {
        this.componente = componente;
    }

    public void simular() {
        System.out.println("Simulando componente: " + componente.toString());
    }
}
