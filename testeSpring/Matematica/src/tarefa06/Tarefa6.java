package tarefa06;

import javax.swing.*;

public class Tarefa6 {
    public static void main(String[] args) {

        exibeMsg(verificarEquação(lerDouble("Qual o resultado de X  na equação (5x + 3 = 2x + 18) : "))? "O valor está certo " : " A resposta está errada ");

    }

    static Boolean verificarEquação(double x){
        return (5*x+3) == (2*x+18);
    }

    public static void exibeMsg(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }

    public static int lerInt(String txt) {
        return Integer.parseInt(JOptionPane.showInputDialog(txt));
    }

    public static double lerDouble(String txt) {
        return  Double.parseDouble(JOptionPane.showInputDialog(txt));
    }

    public static String lerString(String txt) {
        return JOptionPane.showInputDialog(txt);
    }
}
