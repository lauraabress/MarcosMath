package atividades_revisão_prova;

import javax.swing.*;

public class ValidadorSenha {
    public static void main(String[] args) {

        String s1 = setString("Digite a senha  : ");
        String s2 = setString("Digite a confirmação : ");

        if (iguais(s1,s2) && tamMin(s1) && temArroba(s1))
            exibMsg("Válida");
        else
            exibMsg("Inválida");

    }
    public static boolean iguais (String s1 , String s2){
        return s1.equals(s2);
    }
    public static boolean tamMin(String s1){
        return s1.length() >= 10;
    }

    public static boolean temArroba(String s1){
        return s1.contains("@");
    }

    public static String setString(String txt){
        return JOptionPane.showInputDialog(txt);
    }

    public static void exibMsg (String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
