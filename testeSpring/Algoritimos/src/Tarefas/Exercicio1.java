package Tarefas;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String[] cores = new String[5];

        for (int i = 0; i < 5; i++) {
            cores[i] = lerMsg("Qual a "+(i+1)+ " selecionada :");
        }

        exibirMsg(mostrarInverso(cores));

    }

    private static String mostrarInverso(String[] cores) {
        String msg ="";
        for (int i = 4; i >= 0;i--){
            msg += cores[i]+" - ";
        }
        return msg;
    }

    public static String lerMsg(String txt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(txt);
        return scan.nextLine();

    }

    public static void exibirMsg(String msg) {
        System.out.println(msg);
    }
}
