import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;

    private Set<Telefone> telefones;

    public String getNome() {

        return nome;
    }

    public void setNome(String novoNome) {

        nome = novoNome;
    }

    public Pessoa(String nome) {

        this.nome = nome;
        this.telefones = new HashSet<>();
    }

    public void addTelefone(Telefone numero) {

        telefones.add(numero);
    }

    public void removeTelefone(Telefone numero) {

        telefones.remove(numero);
    }

    @Override
    public String toString() {
        StringBuilder telefonesStr = new StringBuilder("Telefones:\n");
        for (Telefone numero : telefones) {
            telefonesStr.append(numero).append("\n");
        }
        return "Nome: " + nome + "\n" + telefonesStr.toString();
    }
}
