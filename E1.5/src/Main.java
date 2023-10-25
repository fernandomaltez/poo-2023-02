public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);

        Retangulo retangulo1 = new Retangulo(2, 5);

        Triangulo triangulo1 = new Triangulo(2, 5);

        double varcirculo1, varretangulo1, vartriangulo1;

        varcirculo1 = circulo1.calcularArea();

        varretangulo1 = retangulo1.calcularArea();

        vartriangulo1 = triangulo1.calcularArea();

        // Crie um array de valores de área
        double[] areas = { varcirculo1, varretangulo1, vartriangulo1 };

        // Chame o método calcularAreaTotal da classe CalculadoraArea
        double areaTotal = CalculadoraArea.calcularAreaTotal(areas);

        // Imprima o resultado
        System.out.println("Área total: " + areaTotal);

    }

}