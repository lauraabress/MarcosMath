package Tarefas;

import javax.swing.*;

public class Exercicio2Professor {

    static String[] marcas = new String[20];
    static String[] placas = new String[20];
    static int[] anos = new int[20];
    static int cont = 0;

    public static void main(String[] args) {

        int op = 0;

        do {

            op = menu();
            switch (op) {
                case 1 -> cadastrar();
                case 2 -> maisNovo();
                case 3 -> buscarPorPlaca();
                case 4 -> exibeMsg("Programa encerrado ");
                default -> exibeMsg("Valor inserido errado");
            }

        } while (op != 4);

    }

    public static void maisNovo() {

        int anoMaior = anos[0];
        String marcaMaior = marcas[0];
        String placaMaior = placas[0];

        for (int i = 1; i < cont; i++) {
            if (anos[i] > anoMaior) {
                anoMaior = anos[i];
                marcaMaior = marcas[i];
                placaMaior = placas[i];
            }
        }

        exibeMsg("Carro mais novo:\n" + marcaMaior + "\n" + placaMaior + "\n" + anoMaior);
    }

    public static void buscarPorPlaca() {
        String placaBusca = lerString("Qual placa deseja buscar : ");
        int indice = -1;
        for (int i = 0; i < cont; i++) {
            if (placaBusca.equals(placas[i])) {
                indice = i;
            }

            if (indice == -1) {
                exibeMsg("Não existe esta placa ");
            } else {
                exibeMsg(marcas[indice] + " - " + anos[indice] + " - " + placas[indice]);
            }

        }
    }

    public static void cadastrar() {
        if (cont >= 20) {
            exibeMsg("Limite exedido");
        } else {
            marcas[cont] = lerString("Marca : ");
            placas[cont] = lerString("Placa : ");
            anos[cont] = lerInt("Anos :");
            cont++;
        }

    }

    public static int menu() {
        String m = ("1 – Cadastrar Carro" +
                "\n2 – Verificar qual a marca e a placa do carro mais novo\n" +
                "\n3 – Buscar a marca e o ano por uma placa específica (o usuário irá informar a placa e o programa vai mostrar os dados caso encontre a respectiva placa)" +
                "\n4 - Sair");
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
