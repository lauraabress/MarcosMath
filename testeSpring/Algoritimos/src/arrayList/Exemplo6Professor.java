package arrayList;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exemplo6Professor {


    static ArrayList<String> nomes = new ArrayList<String>();
    static ArrayList<String> fones = new ArrayList<String>();

    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();
            if (op == 1) cadastrar();
            if (op == 2) buscar("nome");
            if (op == 3) buscar("telefone");
        } while (op != 4);
    }

    static void exiibeDados(int indice) {
        if (indice == -1) {
            exibeMsg("Não encontrado");
        } else {
            exibeMsg("Nome : " + nomes.get(indice) + "\nTelefone : " + fones.get(indice));
        }
    }

    static void buscar(String tipoBusca) {
        String busca = lerStr("Qual " + tipoBusca + " deseja buscar?");
        if (tipoBusca.equals("nome")) {
            exiibeDados(nomes.indexOf(busca));
        } else {
            exiibeDados(fones.indexOf(busca));
        }

    }

    static void cadastrar() {

        nomes.add(lerStr("Nome:"));
        fones.add(lerStr("Telefone:"));

    }


    static int menu() {
        String m = "1 - Cadastrar\n"
                + "2 - Buscar por nome\n"
                + "3 - Buscar por telefone\n"
                + "4 - SAIR";
        return lerInt(m);
    }

    static int lerInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg));
    }

    static String lerStr(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    static void exibeMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}

