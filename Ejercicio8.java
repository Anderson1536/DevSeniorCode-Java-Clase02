import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Area y Perimero de un rectangulo");

        System.out.println("Ingresa el valor de la longitud del rectangulo: ");
        double longitud = entrada.nextDouble();

        System.out.println("Ingresa el valor del ancho del rectangulo: ");
        double ancho = entrada.nextDouble();

        double area = longitud*ancho;
        double perimetro = (longitud+ancho)*2;

        System.out.println("El área del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);

        entrada.close();
    }
}
