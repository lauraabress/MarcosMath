package tarefa06;

import javax.swing.*;

public class Tarefa7 {
    public static void main(String[] args) {

        exibeMsg("R$ "+valorComissão(lerDouble("Qual o valor das vendas do atendente : "))+" de comissão do(a) atendente");

    }

    static double valorComissão(double valorVendas){
        return valorVendas*0.12;
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
