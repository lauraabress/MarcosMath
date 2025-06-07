package desconto;

import javax.swing.*;

public class Tarefa14 {
    public static void main(String[] args) {
       double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto :"));
       double desc = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcemtagem do desconto :"));

       JOptionPane.showMessageDialog(null,"Valor final do produto :"+AplicarDesconto(valor,desc));
    }
    public static double AplicarDesconto(double valor, double desc){
        return valor * (desc/100);
    }
}
