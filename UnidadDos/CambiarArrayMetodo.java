public class CambiarArrayMetodo {
    public static void main(String[] args) {
        int[] numeros = {0,0,0,0,0};
        System.out.println("Antes del metodo = "+java.util.Arrays.toString(numeros));
        CambiarArray(numeros);
    }
    public static void CambiarArray(int[] numeros) {
        for (int i = 1; i < numeros.length; i++) {
             numeros[i] = i*5;
        }
        System.out.print("Despues del metodo = "+java.util.Arrays.toString(numeros));
        
    }
}
