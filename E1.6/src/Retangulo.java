public class Retangulo extends Quadrado {

    public double altura;

    public Retangulo(double lado, double altura) {

        super(lado);
        this.altura = altura;

    }

    @Override
    public double calculadorArea() {

        return lado * altura;
    }

    @Override
    public double calculadorPerimetro() {

        return ((2 * lado) + (2 * altura));
    }

    @Override
    public String desenhar() {
        return "Desenho de um retângulo";
    }
}
