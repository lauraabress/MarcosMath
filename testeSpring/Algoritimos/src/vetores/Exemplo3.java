package vetores;

import javax.swing.*;

public class Exemplo3 {

    static int []idades = new int[10];
    static int qtd = 0;

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
        for (int i = 0;i<qtd;i++){

            res += idades[i]+"\n";

             }
        exibeMsg(res);
    }

    public static void cadastrar(){
        if (qtd>=10){
            exibeMsg("Limite exedido");
        }else {
            idades[qtd] = lerInt("Idade"+(qtd+1));
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
