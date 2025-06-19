package Recursividade;

import javax.swing.*;

public class Fatorial {

    public static long calcularFatorial(int n) {
        // Caso Base: se n for 0 ou 1, o fatorial é 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Passo Recursivo: n * fatorial(n-1)
        else {
            System.out.println("Fatorial de " + n);
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero para fatorial : "));
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado); // Saída: O fatorial de 5 é: 120

        numero = 0;
        resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado); // Saída: O fatorial de 0 é: 1
    }
}
