package prova;

import javax.swing.*;

public class Questao3 {
    private static int op;
    private static String txt;

    public static void main(String[] args) {
        double saldoBanco = lerDouble("Qual o seu saldo bancario : ");
        int op = 0;

        do {
            op = menu(saldoBanco);
            switch (op) {
                case 1:
                    saldoBanco = depositar(saldoBanco);
                    break;
                case 2:
                    double saldo = sacar(saldoBanco);
                    if (saldo != -1) {
                        saldoBanco = saldo;
                    }
                    break;
                case 3:
                    exibeMsg("O programa foi encerrado");
                    break;
                default:
                    exibeMsg("Texto inserido incorreto ");
            }
        } while (op != 3);

    }

    static double depositar(double saldoBanco) {
        return saldoBanco + lerDouble("Valor a depositar");
    }

    static double sacar(double saldoBanco) {
        double valorFinal = -1;
        if (saldoBanco <= 0) {
            exibeMsg("O seu saldo está ou ficará negativo");
        } else {
            double valorSaque = lerDouble("Valor de saque : ");
            if (saldoBanco - valorSaque < 0) {
                exibeMsg("O saldo ficara negativo, operação cancelada ");
            } else {
                valorFinal = saldoBanco - valorSaque;

            }
        }
        return valorFinal;
    }

    static int menu(Double saldo) {
        return lerInt("    MENU   " +
                "\nSaldo =  " + saldo +
                "\n1 - Depositar" +
                "\n2 - Sacar" +
                "\n3 - Sair");
    }

    public static void exibeMsg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }

    public static int lerInt(String txt) {
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static double lerDouble(String txt) {
        return Double.parseDouble(JOptionPane.showInputDialog(txt));
    }
}
