public class Circulo extends Figura implements Desenho {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculadorArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculadorPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double novoRaio) {
        raio = novoRaio;
    }

    @Override
    public String desenhar() {
        return "Desenho de um círculo";
    }
}
