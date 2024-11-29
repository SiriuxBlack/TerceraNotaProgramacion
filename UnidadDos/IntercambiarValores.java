public class IntercambiarValores {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Antes del metodo a="+a+" b="+b);
        intercambiar(a, b);
    }
    public static void intercambiar(int a, int b) {
        int tempA = a;
        a = b;
        b = tempA;
        System.out.println("En el metodo a="+a+" b=" + b);
        
    }
}
