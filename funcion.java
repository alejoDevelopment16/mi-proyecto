public class funcion {

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio){
        return 2*Math.PI*radio;  
    }

    public static double calcularDiametro(double radio){
        return 2*radio;
    }
    
    public static void main(String[] args) {
        double radio = 5.0;
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);
        double diametro = calcularDiametro(radio);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        System.out.println("El perímetro del círculo con radio " + radio + " es: " + perimetro);
        System.out.println("El diámetro del círculo con radio " + radio + " es: " + diametro);
    }
}