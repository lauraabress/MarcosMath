package atividadeSala;

import static atividadeSala.Atividade6.scan;

public class Atividade10 {
    public static void main(String[] args) {
        double altura = lerDouble("Qual a altura do retangulo : ");
        double largura = lerDouble("Qual a largura do retangulo : ");

        System.out.printf("A área do produto é = %.2f",altura*largura);
    }

    private static double lerDouble(String txt) {
        System.out.println(txt);
        return Double.parseDouble(scan.nextLine());
    }
}