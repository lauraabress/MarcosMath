package atividadeSala;

import java.util.Scanner;

public class Atividade6 {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int seg = Integer.parseInt(lerString("Digite os segundos para convertelos : "));
        int min = convertSegPMin(seg);
        double hr = convertMinPHora(min);

        System.out.printf("Horas : %.2f ",hr);
        System.out.println("\nMinutos : "+min);
        System.out.println("Seg :"+seg);
    }

    private static double convertMinPHora(int min) {
        return (double) min/60;
    }

    private static String lerString(String txt){
        System.out.println(txt);
        return scan.nextLine();
    }

    private static int convertSegPMin(int seg){
        return seg/60 ;
    }
}
