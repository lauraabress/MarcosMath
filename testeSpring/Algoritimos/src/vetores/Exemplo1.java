package vetores;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        int[] idade = new int[lerInt("Quantas pessoas deseja cadastrar : ",scan)];

        for (int i = 0 ; i < idade.length ; i++){
            System.out.println("Digite a idade da "+(i+1)+" pessoa");
            idade[i] = scan.nextInt();
            soma += idade[i];
        }
            mostrarMsg("A média das idades é : "+calcMedia(soma,idade.length));

    }

    public static int lerInt(String txt, Scanner scan) {

        System.out.println(txt);
        return scan.nextInt();

    }

    public static double calcMedia(int soma, int qtd) {
        return (double) soma / qtd;
    }

    public static void mostrarMsg(String msg){
        System.out.println(msg);;
    }
}
