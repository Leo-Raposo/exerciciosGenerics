package ex03;

public class PersonagemParser implements Parser<Personagem> {
    @Override
    public Personagem parse(String linha) {
        String[] partes = linha.split(",");
        return new Personagem(partes[0].trim(), partes[1].trim());
    }
}
