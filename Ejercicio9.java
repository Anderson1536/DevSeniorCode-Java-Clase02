import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversión de temperaturas");
        System.out.println("Ingresa el valor de la temperatura: ");
        double temperaturaC = entrada.nextDouble();

        double Fahrenheit = temperaturaC * 9/5 + 32;
        double Kelvin = temperaturaC + 273.15;

        System.out.println("La temperatura en grados Fahrenheit es: "+Fahrenheit);
        System.out.println("La temperatura en grados Kelvin es: "+Kelvin);

        entrada.close();
    }
}
