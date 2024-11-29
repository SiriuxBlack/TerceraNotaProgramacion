public class ObservarNumeroAfuera {

    public static void main(String[] args) {
        int num = 1;
        System.out.println("Fuera del metodo cambiarValor = "+num);
        cambiarValor(num); 
    }
    public static void cambiarValor(int num) {
        num = 73;
        System.out.println("Dentro del metoto = " + num);  
    }
}