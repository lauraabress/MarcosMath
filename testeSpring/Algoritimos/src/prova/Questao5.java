package prova;

import javax.swing.*;
import java.util.ArrayList;

public class Questao5 {
    static ArrayList<String> nomeProduto = new ArrayList<String>();
    static ArrayList<Integer> qtdProduto = new ArrayList<Integer>();

    public static void main(String[] args) {

        int op = 0;

        do {
            op = menu();
            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    int id = buscarNome();
                    if (id != -1) {
                        exibeMsg("Quantidade do produto : " + qtdProduto.get(id));
                    } else {
                        exibeMsg("Produto não existe");
                    }
                    break;
                case 3:
                    exibeMsg(maisDeDez());
                    break;
                case 4:
                    exibeMsg("Programa encerrado");
                    break;
                default:
                    exibeMsg("O numero digitado não existe no menu ");
            }
        } while (op != 4);
    }

    private static String maisDeDez() {
        String res = "";
        for (int i = 0; i < nomeProduto.size(); i++) {
            if (qtdProduto.get(i) > 10) {
                res += "Nome : " + nomeProduto.get(i) + "\nQuantidade : " + qtdProduto.get(i) + "\n----------------------------\n";
            }
        }
        return res;
    }

    private static int buscarNome() {
        return nomeProduto.indexOf(lerString("Qual produto estamos buscando : "));

    }

    private static void cadastrar() {

        nomeProduto.add(lerString("Nome do produto : "));
        qtdProduto.add(lerInt("Quantos produtos iremos comprar :"));

    }

    static int menu() {
        return lerInt("---- Menu ----" +
                "\n1 - Cadastrar" +
                "\n2 - Buscar por nome" +
                "\n3 - Produtos com mais de 10 itens" +
                "\n4 - Sair");
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
