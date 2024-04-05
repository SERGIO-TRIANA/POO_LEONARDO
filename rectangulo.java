public class rectangulo {
    // Atributos
    private double ancho;
    private double alto;

    // Constructor
    public rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Métodos para obtener y establecer el ancho y el alto
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return ancho * alto;
    }

    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    public boolean esCuadrado() {
        return ancho == alto;
    }

    // Método para imprimir información sobre el rectángulo
    public void imprimirInformacion() {
        System.out.println("Rectángulo:");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());

    }

}
