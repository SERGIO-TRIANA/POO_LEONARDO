import java.util.Scanner;

public class Interes_Compuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el periodo en años: ");
        int periodo = scanner.nextInt();

        System.out.print("Ingrese la tasa de interés (porcentaje): ");
        double tasaInteres = scanner.nextDouble() / 100;

        System.out.print("Ingrese el valor inicial: ");
        double valorInicial = scanner.nextDouble();


        for (int i = 1; i <= periodo; i++) {
            double saldoFinal = valorInicial * Math.pow(1+tasaInteres, i);
            System.out.println("periodo " + i +": "+ saldoFinal);
            valorInicial = saldoFinal;
        }
    }
}

