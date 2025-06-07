package atividades_revisão_prova;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {
        double min = lerDouble("Temp min :");
        double max = lerDouble("Temp max :");
        double atual = lerDouble("Temp atual :");
        JOptionPane.showMessageDialog(null, verificarLimite(max, min, atual));
        JOptionPane.showMessageDialog(null, "Diferença média :" + diferenca(max, min, atual));
        msgAlerta(max,atual);
    }


    public static double lerDouble(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

    public static String verificarLimite(double max, double min, double atual) {

        if (atual >= min && atual <= max)
            return "Está faixa está permitida";
        return "Esta faixa esta fora do limite";

    }

    public static double diferenca(double max, double min, double atual) {
        double media = (max + min) / 2;

        double diferenca = atual - media;
        if (diferenca < 0)
            diferenca *= -1;

        return diferenca;
    }

    public static void msgAlerta(double max, double atual) {
        if (atual > max + 5)
            JOptionPane.showMessageDialog(null, "Vai explodir, BUUUUUUUUUUUUM","ALERTA",2);
    }
}

