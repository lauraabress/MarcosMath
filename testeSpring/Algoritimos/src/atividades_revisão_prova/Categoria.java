package atividades_revisão_prova;

import javax.swing.*;

public class Categoria {
    public static void main(String[] args) {

        int n = lerInt("Quantas pessoas pretende cadastrar ");
        String resultado = "";

        for (int i = 0; i < n; i++) {
            String nome = JOptionPane.showInputDialog("Nome : ");
            resultado += nome + " - "+ verificaCategoria(lerInt("Idade de " + nome))+"\n";
        }

        exibirMsg(resultado);


    }

    public static String verificaCategoria(int idade) {
        if (idade < 5)
            return "Idade inválida";
        if (idade <= 7)
            return "Infantil A";
        if (idade <= 10)
            return "Infantil B";
        if (idade <= 17)
            return "Juvenil";
        return "Adulto";

    }

    public static int lerInt(String txt) {
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static void exibirMsg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}
