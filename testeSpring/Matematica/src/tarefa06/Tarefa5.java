package tarefa06;

import javax.swing.*;

public class Tarefa5 {
    public static void main(String[] args) {

    exibeMsg(qtdLitros(lerDouble("Quantos km você ira rodar : "))+" Litros");


    }
    static double qtdLitros (double km ){
        return km/12;
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
