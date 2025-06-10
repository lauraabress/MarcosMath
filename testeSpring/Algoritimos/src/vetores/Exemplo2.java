package vetores;

import java.util.Scanner;

public class Exemplo2 {

    static Scanner scan = new Scanner(System.in);
    static String[] nome = new String[100];
    static int[] idade = new int[100];
    static int count = 0;

    public static void main(String[] args) {

        int op = 0;

        while (op != 4) {
            op = menu();
            switch (op) {
                case 1:
                    Cadastrar();
                    break;
                case 2:
                    buscarPosicao();
                    break;
                case 3:
                    ListarUsuarios();
                    break;
            }

        }

    }

    private static void buscarPosicao() {
        int pos = Integer.parseInt(lerMsg("Qual posição desja buscar :"));
        if (pos > 0 && pos <= count)
            System.out.println("\nId " + (pos) + "\nNome : " + nome[pos - 1] + "\nIdade : " + idade[pos - 1]);
        else {
            exibirMsg("Posição invalida");
        }
    }

    private static void ListarUsuarios() {
        System.out.println("Pessoas Cadastradas :");
        for (int i = 0; i < count; i++) {
            System.out.println("\nId " + (i + 1) + "\nNome : " + nome[i] + "\nIdade : " + idade[i]);
        }
        exibirMsg("-------------------------------");
    }

    private static void Cadastrar() {
        if (count < 100) {
            System.out.println("Digite a " + (count + 1) + " pessoa ");
            nome[count] = lerMsg("Qual o nome do usuario :");
            idade[count] = Integer.parseInt(lerMsg("Qual a idade de " + nome[count] + " :"));
            count++;
        } else {
            exibirMsg("Cadastro chegou no limite de 100 usuarios");
        }
    }

    public static int menu() {
        return Integer.parseInt(lerMsg("\nMENU\n1 - cadastrar\n2 - Verificar posição\n3 - Listar todos\n4 - sair"));
    }

    public static String lerMsg(String txt) {

        System.out.println(txt);
        return scan.nextLine();

    }

    public static void exibirMsg(String msg) {
        System.out.println(msg);
    }

}
