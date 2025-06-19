package arrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Exemplo3Vetores {
   static ArrayList<Integer> idades = new ArrayList<>();
    public static void main(String[] args) {
        int op = 0;
        do {
            op = menu();
            if (op == 1){cadastrar();}
            if (op == 2){listar();}

        }while (op!=3);
    }

    public static int menu() {
        return lerInt("\nMENU\n1 - cadastrar\n2 - Listar\n3 - sair");
    }

    public static void listar(){
        String res = "";
        for (int idade : idades){

            res += idade + "\n";

        }
        exibeMsg(res);
    }

    public static void cadastrar(){
            idades.add(lerInt("Idade"+(idades.size() + 1 )));

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
