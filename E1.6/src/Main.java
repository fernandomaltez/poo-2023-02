import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figura> listaDeFiguras = new ArrayList<>();

        Circulo circulo1 = new Circulo(5);

        Retangulo retangulo1 = new Retangulo(2, 5);

        Quadrado quadrado1 = new Quadrado(4);

        Triangulo triangulo1 = new Triangulo(3, 4, 5, 1.65);

        listaDeFiguras.add(circulo1);

        listaDeFiguras.add(retangulo1);

        listaDeFiguras.add(quadrado1);

        listaDeFiguras.add(triangulo1);

        for (Figura lista1 : listaDeFiguras) {
            System.out.println("\n\nÁrea da figura : " + lista1.calculadorArea());

            System.out.println("Perímetro da figura : " + lista1.calculadorPerimetro());

        }

        System.out.println(quadrado1.desenhar());

        System.out.println(retangulo1.desenhar());

        System.out.println(circulo1.desenhar());

        System.out.println(triangulo1.desenhar());

    }
}
