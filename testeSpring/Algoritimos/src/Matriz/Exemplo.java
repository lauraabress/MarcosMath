package Matriz;

import javax.swing.*;

public class Exemplo {
    //linhas - colunas
    //      Mat | vesp | not
    //dom
    //seg
    //ter
    //qua
    //qui
    //sex
    //sab
    static int[][] atendimentos = new int[7][3];

    public static void main(String[] args) {
        cadastrar();
        listar();
    }

    static void listar() {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(atendimentos[i][j]);
                System.out.print(" - ");
            }
            System.out.println("\n----------------------");
        }

    }

    static void cadastrar() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                atendimentos[i][j] = lerInt("Atendimentos " + i + " - " + j);
            }
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
