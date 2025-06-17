package Tarefas;

import javax.swing.*;

public class Atividade6 {

    static String nomes[] = new String[100];
    static String tel[] = new String[100];
    static int qtd = 0;

    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1 -> cadastra();
                case 2 -> tipoBusca("nome");
                case 3 -> tipoBusca("Telefone");
                case 4 -> exibeMsg("Sair");
                default -> exibeMsg("Numero errado inserido");
            }
        } while (op != 4);
    }

    static void tipoBusca(String tipoBusca) {

        String busca = lerString("Qual " + tipoBusca + " deseja buscar : ");
        int indice = -1;
        if (tipoBusca.equals("nome")) {
            for (int i = 0; i < qtd; i++) {
                if (nomes[i].equalsIgnoreCase(busca)) {
                    indice = i;
                }
            }
        } else {
            for (int i = 0; i < qtd; i++) {
                if (tel[i].equalsIgnoreCase(busca)) {
                    indice = i;
                }
            }
        }

        if (indice == -1) {
            exibeMsg("Sua busca não retornou resposta");
        }else {
            exibeMsg("Nome : "+ nomes[indice]+"\nTelefone : "+tel[indice]);
        }

    }


    static int menu() {
        String m = "1 - Cadastrar" +
                "\n2 - Buscar por nome" +
                "\n3 - Buscar por telefone" +
                "\n4- sair";
        return lerInt(m);
    }

    static void cadastra() {

        if (qtd >= 100) {
            exibeMsg("Limite exedido");
        } else {
            nomes[qtd] = lerString("Nome : ");
            tel[qtd] = lerString("Telefone :");
            qtd++;
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
