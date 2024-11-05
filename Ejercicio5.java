public class Ejercicio5 {
    public static void main(String[] args) {
        int totalPc = 660;
        int descuento = 10;

        int valorDescuento = (totalPc*descuento)/100;
        int valorFinal = totalPc-valorDescuento;

        System.out.println("El costo final del ordenador es: "+valorFinal+" Euros");
    }
}
