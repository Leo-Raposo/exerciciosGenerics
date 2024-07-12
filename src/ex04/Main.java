package ex04;

public class Main {
    public static void main(String[] args) {

        RedeLocal redeLocal = new RedeLocal("Computador do Finn");
        RedeSemFio redeSemFio = new RedeSemFio("Tablet da Princesa Jujuba");
        RedeWAN redeWAN = new RedeWAN("Servidor do Rei Gelado");

        redeLocal.simular();
        redeSemFio.simular();
        redeWAN.simular();

        AnalisadorDadosGenerico<String> analisador = new AnalisadorDadosGenerico<>("src/ex04/aventura.txt");
        analisador.analisar();
    }
}
