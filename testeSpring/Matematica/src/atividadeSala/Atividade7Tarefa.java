package atividadeSala;

import javax.swing.*;
import java.text.DecimalFormat;

public class Atividade7Tarefa {
    public static void main(String[] args) {
        int op = 0;

        do {
            op = opMenu();
            switch (op) {
                case 1:
                    toAnother(5.56, "Dólar");
                    break;
                case 2:
                    toReal(5.56, "Dólar");
                    break;
                case 3:
                    toAnother(6.35, "Euro");
                    break;
                case 4:
                    toReal(6.35, "Euro");
                    break;
                case 5:
                    msg("Adeus");
            }
        } while (op != 5);

    }

    public static void msg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }

    public static int opMenu() {
        String menu = "1 - real para dolar\n" +
                "2 - dolar para real\n" +
                "3 - real para euro\n" +
                "4 - euro para real\n" +
                "5 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public static double lerDouble(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

    public static void toReal(double cotacao, String nome) {
        double moeda = lerDouble("Valor da outra moeda : ");
        DecimalFormat df = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, df.format(cotacao * moeda) + "reais de " + nome);
    }

    public static void toAnother(double cotacao, String nome) {
        double reais = lerDouble("Quantos reais :");
        DecimalFormat df = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, df.format(reais / cotacao) + " em " + nome);
    }
}

