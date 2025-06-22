package tarefa06;

public class CalcDividendo {
    public static void main(String[] args) {
        double valor = 3000;
        for (int i = 1; i <= 10; i++) {
            valor *= 1.2;
            System.out.printf("Valor do "+i+" mês : %.2f ",valor);
            System.out.println("");


        }
    }

}
