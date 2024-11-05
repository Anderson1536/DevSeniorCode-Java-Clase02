import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Media Aritmetica");
        System.out.println("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int num3 = entrada.nextInt();

        int promedio = (num1 + num2 + num3)/3;

        System.out.println("La media aritmetica de los valores ingresados es: "+promedio);

        entrada.close();
    }
}
