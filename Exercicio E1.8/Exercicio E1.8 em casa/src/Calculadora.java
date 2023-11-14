import javax.swing.*;
import java.awt.event.*;

public class Calculadora {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        // criando o primeiro espaço dentro da janela "calculadora"
        JLabel labelbox1 = new JLabel("Digite um número:");

        // definindo o tamanho do espaço
        labelbox1.setBounds(20, 20, 130, 25);

        // adicionando esse label criado na aba "panel"
        panel.add(labelbox1);

        // definindo que o primeiro label será uma caixa de texto
        JTextField textbox1 = new JTextField(10);
        textbox1.setBounds(150, 20, 165, 25);
        panel.add(textbox1);

        // criando outro espaço na janela(panel)
        JLabel labelbox2 = new JLabel("Digite outro número:");
        labelbox2.setBounds(20, 50, 150, 25);
        panel.add(labelbox2);

        // definindo que o segundo label será uma caixa de texto
        JTextField textbox2 = new JTextField(10);
        textbox2.setBounds(150, 50, 165, 25);
        panel.add(textbox2);

        JButton multiplicarButton = new JButton("*");
        multiplicarButton.setBounds(100, 80, 45, 25);
        panel.add(multiplicarButton);

        JButton somarButton = new JButton("+");
        somarButton.setBounds(160, 80, 45, 25);
        panel.add(somarButton);

        JButton subtrairButton = new JButton("-");
        subtrairButton.setBounds(220, 80, 45, 25);
        panel.add(subtrairButton);

        JButton dividirButton = new JButton("/");
        dividirButton.setBounds(280, 80, 45, 25);
        panel.add(dividirButton);

        JLabel resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(20, 150, 250, 25);
        panel.add(resultadoLabel);

        somarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textbox1.getText());
                    double numero2 = Double.parseDouble(textbox2.getText());

                    resultadoLabel.setText("A soma é: " + (numero1 + numero2));

                }

                catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        subtrairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textbox1.getText());
                    double numero2 = Double.parseDouble(textbox2.getText());

                    resultadoLabel.setText("A subtração é: " + (numero1 - numero2));

                }

                catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textbox1.getText());
                    double numero2 = Double.parseDouble(textbox2.getText());

                    resultadoLabel.setText("A multiplicação é: " + (numero1 * numero2));

                }

                catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textbox1.getText());
                    double numero2 = Double.parseDouble(textbox2.getText());

                    resultadoLabel.setText("A divisão é: " + (numero1 / numero2));

                }

                catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}