import java.util.Scanner;
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class CalcularRaiz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero = ");
            double num = sc.nextDouble();
            if (num < 0) {
                throw new NumeroNegativoException("No existe raiz cuadrada de un numero negativo");
            }
            double raiz = Math.sqrt(num);
            System.out.println("La raiz cuadrada es: " + raiz);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
