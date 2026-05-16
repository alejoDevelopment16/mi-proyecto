public class funcion {

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        double radio = 5.0;
        double area = calcularArea(radio);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }
}