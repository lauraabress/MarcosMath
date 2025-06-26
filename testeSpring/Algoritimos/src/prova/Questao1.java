package prova;

import javax.swing.*;

public class Questao1 {
    static int ads = 0;
    public static void main(String[] args) {

        int qtdCursos = lerInt("Quantos cursos de alunos irão ser cadastrados :");

        cadastrarTodos(qtdCursos);

        exibeMsgFinal("A porcemtagem de alunos em ADS foi : "+calPorentagem(qtdCursos));

    }

    private static void cadastrarTodos(int qtdCursos) {
        for (int i = 0; i < qtdCursos; i++) {
            cadastrar(lerString("Qual o curso do aluno "+(i+1)+" : "));
        }
    }

    static void cadastrar(String curso) {
        if (curso.equals("ADS")) {
        ads++;
        }
    }

    static double calPorentagem(int qtdTotal) {
        return (ads / (double) qtdTotal) * 100;
    }

    public static void exibeMsgFinal(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }

    public static int lerInt(String txt) {
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static double lerDouble(String txt) {
        return Double.parseDouble(JOptionPane.showInputDialog(txt));
    }

    public static String lerString(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
}
