import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        // Crear un objeto Rectangulo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el alto del rectángulo: ");
        double alto = scanner.nextDouble();

        rectangulo miRectangulo = new rectangulo(ancho,alto);


        // Imprimir información sobre el rectángulo
        miRectangulo.imprimirInformacion();
        if (miRectangulo.esCuadrado()) {
            System.out.println("El rectángulo es un cuadrado.");
        } else {
            System.out.println("El rectángulo no es un cuadrado.");
        }
    }
}
