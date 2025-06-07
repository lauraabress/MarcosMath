package atividadeSala;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1 : ");
        double nota1 = scan.nextInt();
        System.out.println("Nota 2 : ");
        double nota2 = scan.nextInt();
        System.out.println("Nota 3 : ");
        double nota3 = scan.nextInt();
        scan.close();

        double media = calcMedia(nota1, nota2, nota3);

        System.out.println("O aluno" + classificacao(media) + " com media = " + media);

    }

    public static String classificacao(double media) {
        if (media >= 7)
            return " foi Aprovado";
        if (media >= 5 && media <= 6.9)
            return " esta em recuperação";
        return " foi reprovado";
    }

    public static double calcMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }


}
