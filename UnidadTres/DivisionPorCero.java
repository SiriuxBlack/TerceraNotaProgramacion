import java.util.Scanner;
public class DivisionPorCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primero numero = ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero = ");
        int numero2 = sc.nextInt();
        try {
            int resultado = numero1 / numero2;
            System.out.println("Reseultado = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por cero");
        }
        sc.close();
    }
}
