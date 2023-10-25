public class CalculadoraArea {
    public static double calcularAreaTotal(double[] areas) {
        double areaTotal = 0.0;
        for (double area : areas) {
            areaTotal += area;
        }
        return areaTotal;
    }
}