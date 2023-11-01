public class Quadrado extends Figura implements Desenho {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calculadorArea() {
        return lado * lado;
    }

    public double calculadorPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double novoLado) {
        lado = novoLado;
    }

    @Override
    public String desenhar() {
        return "Desenho de um quadrado";
    }

}