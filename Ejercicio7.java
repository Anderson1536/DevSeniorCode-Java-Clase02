import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora Basica");
        System.out.println("Por favor ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Por favor ingrese el segundo numero:");
        int num2 = entrada.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1/num2;

        System.out.println("Resultado Suma: "+suma);
        System.out.println("Resultado Resta: "+resta);
        System.out.println("Resultado Multiplicacion: "+multiplicacion);
        System.out.println("Resultado Division: "+division);

        entrada.close();
    }
}
