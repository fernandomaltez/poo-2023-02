public class Telefone {

    private String numero;

    private String getNumero() {

        return numero;
    }

    private void setNumero(String novoNumero) {

        numero = novoNumero;
    }

    public Telefone(String numero) {

        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone: " + numero;
    }
}
