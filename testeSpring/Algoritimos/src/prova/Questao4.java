package prova;

import javax.swing.*;

public class Questao4 {
    public static void main(String[] args) {

        double salario =lerDouble("Qual o salario do funcionario : ");
        int dep = lerInt("Quantos dependentes tem o funcionario : ");
        exibeMsg("O salario de "+salario+"\npassou para "+calcSalarioFinal(salario,dep)+"\npor ter "+dep +" dependentes ");


    }

    static double calcSalarioFinal(double salario,int dep){
        return salario + (100*dep);
    }

    public static void exibeMsg(String txt) {
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
