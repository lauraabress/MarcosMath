package prova;

import javax.swing.*;

public class Questao2 {
    public static void main(String[] args) {

        double salario = lerDouble("Qual o salario do funcionario ? : ");
        int qtdVendas = lerInt("Qual o total de vendas do mês : ");
        exibeMsg("Salario com comição : " + calcComicao(qtdVendas, salario));

    }

    static double calcComicao(int totalVendas, double salario) {

        if (totalVendas > 20000) {
            return salario * 1.20;
        } else {
            return salario * 1.10;
        }

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
