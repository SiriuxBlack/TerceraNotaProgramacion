public class ModificarEntero {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Antes del paso por valor = "+numero);
        Modificar(numero);
    }
    public static void Modificar(int numero) {
        numero =100;
        System.out.println("Despues del paso por valor = "+numero);
    }
}
