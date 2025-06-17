package Tarefas;

import javax.swing.*;

public class Exercicio5 {
    static int qtd = 0;

    static String[] nome = new String[50];
    static int[] estoques = new int[50];
    static double[] precos = new double[50];

    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1 -> cadastrar();
                case 2 -> preco(true);
                case 3 -> preco(false);
                case 4 -> estoque(true);
                case 5 -> estoque(false);
                case 6 -> exibeMsg("Sair");
                default -> exibeMsg("Numero n existente ");

            }
        } while (op != 6);
    }

    static void preco(boolean maior) {
        double estoque = estoques[0];
        int indice = 0;
        if (maior) {
            for (int i = 1; i < precos.length; i++) {
                if (estoques[i] > estoque) {
                    estoque = estoques[i];
                    indice = i;
                }
            }
        } else {
            for (int i = 1; i < estoques.length; i++) {
                if (estoques[i] < estoque) {
                    estoque = estoques[i];
                    indice = i;
                }
            }
        }
        exibeMsg(nome[indice] + " - " + estoques[indice] + " -R$" + precos[indice]);
    }

    static void estoque(boolean maior) {
        double estoque = precos[0];
        int indice = 0;
        if (maior) {
            for (int i = 1; i < precos.length; i++) {
                if (precos[i] > estoque) {
                    estoque = precos[i];
                    indice = i;
                }
            }
        } else {
            for (int i = 1; i < precos.length; i++) {
                if (precos[i] < estoque) {
                    estoque = precos[i];
                    indice = i;
                }
            }
        }
        exibeMsg(nome[indice] + " - " + estoques[indice] + " -R$" + precos[indice]);
    }

    static void cadastrar() {

        if (qtd >= 50) {
            exibeMsg("Limite maximo exedido");
        } else {
            nome[qtd] = lerString("Nome produto : ");
        }

    }

    static int menu() {
        String m = "1 - Cadastrar\n" +
                "\n2 - mercadoria com maior preço" +
                "\n3 - Menor preço" +
                "\n4- maior estoque" +
                "\n5 - menor estoque" +
                "\n6 sair";
        return lerInt(m);
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
