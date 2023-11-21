public class Calc {

    double n1;
    double n2;

    public double somar() {
        return n1 + n2;
    }

    public double diminuir() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() throws ArithmeticException {
        // Tratamento de exceção para divisão por zero
        if (n2 == 0) {
            throw new ArithmeticException("Erro divisão por zero");
        }
        return n1 / n2;
    }
}
