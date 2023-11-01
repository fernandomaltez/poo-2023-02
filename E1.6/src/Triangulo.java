public class Triangulo extends Figura implements Desenho {
    public double base, lado1, lado2, altura;

    public Triangulo(double base, double lado1, double lado2, double altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public double calculadorArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calculadorPerimetro() {
        return lado1 + lado2 + base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double novaBase) {
        base = novaBase;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double novoLado1) {
        lado1 = novoLado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double novoLado2) {
        lado1 = novoLado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        altura = novaAltura;
    }

    @Override
    public String desenhar() {
        return "Desenho de um triangulo";
    }
}
