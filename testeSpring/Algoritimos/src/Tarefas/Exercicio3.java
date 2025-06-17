package Tarefas;

import javax.swing.*;

public class Exercicio3 {

    static String[] nomes;
    static double[] salario;
    static double[] salarioReajustado;

    public static void main(String[] args) {
        int n = lerInt("Quantidade de funcionarios : ");
        nomes = new String[n];
        salario = new double[n];
        salarioReajustado = new double[n];

        cadastra();
        reajuste();
        relatorio();

    }

    static void relatorio() {
        String rel = "";
        for (int i = 0; i < nomes.length; i++) {
            rel +="\nNomes : " +nomes[i] + "\nSalario anterior : " + salario[i] + "\nSalario atual : " + salarioReajustado[i];
        }
        exibeMsg(rel);

    }

    static void reajuste() {

        for (int i = 0; i < salario.length; i++) {
            if (salario[i] <= 400) {
                salarioReajustado[i] = salario[i] * 1.25;
            } else if (salario[i] <= 600) {
                salarioReajustado[i] = salario[i] * 1.20;
            } else if (salario[i] <= 800) {
                salarioReajustado[i] = salario[i] * 1.15;
            } else {
                salarioReajustado[i] = salario[i] * 1.10;
            }
        }

    }

    static void cadastra() {

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = lerString("Nome" + (i + 1) + " : ");
            salario[i] = (double)lerInt("Salario atual de " + nomes[i] + " : ");
        }

    }

    public static void exibeMsg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }

    public static int lerInt(String txt) {
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static String lerString(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
}
