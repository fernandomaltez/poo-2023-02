import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

// Classe de exceção personalizada para números negativos
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String message) {
        super(message);
    }
}

public class Principal {

    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0.00");

        Calc c = new Calc();

        // "c" consiste em um objeto da classe "Calc", a qual possui como atributos "n1"
        // e "n2"

        try {

            c.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o primeiro número:"));

            // "c.n1" representa o primeiro valor inserido no "JOptionPane"

            c.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o segundo número:"));

            // "c.n2" representa o segundo valor inserido no "JOptionPane"

            // Tratamento de exceção para número negativo
            if (c.n1 < 0 || c.n2 < 0) {
                throw new NumeroNegativoException("Entrada de número negativo");
            }

            JOptionPane.showMessageDialog(null, "Soma: " + dc.format(c.somar()));
            JOptionPane.showMessageDialog(null, "Subtração: " + dc.format(c.diminuir()));
            JOptionPane.showMessageDialog(null, "Multiplicação: " + dc.format(c.multiplicar()));
            JOptionPane.showMessageDialog(null, "Divisão: " + dc.format(c.dividir()));
        } catch (InputMismatchException e) { // interfere quando o tipo de dado recebido difere do tipo de dado esperado
            JOptionPane.showMessageDialog(null, "Entrada de Dados Inválida");
        } catch (NumberFormatException e) { // interfere quando o número digitado não é um algarismo
            JOptionPane.showMessageDialog(null, "Valor Inválido");
        } catch (ArithmeticException e) { // interfere quando o segundo valor inserido for zero
            JOptionPane.showMessageDialog(null, "Erro divisão por zero");
        } catch (NumeroNegativoException e) { // interfere quando houver um número negativo entre os números de entrada
            JOptionPane.showMessageDialog(null, "Entrada de número negativo");
        }
    }
}

// try consiste basicamente em executar os passos do programa. Já o catch é um
// scanner que busca por incongruências/exceções que podem haver para o código