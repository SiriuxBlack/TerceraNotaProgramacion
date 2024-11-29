class Persona {
    String nombre; 
    int edad;
    double altura;
}
public class ClasePersona {
    public static void main(String[] args) {
        String nombre = "Miguel Felipe";
        int edad = 16;
        double altura =1.7;
        System.out.println("Hola mi nombre es "+nombre+" tengo "+edad+" años y mido "+altura);
        Persona(nombre,edad,altura); 
    }
    public static void Persona(String nombre, int edad,double altura) {
        nombre = "Matias Felipe";
        edad = 10;
        altura =1.8; 
        System.out.println("Hola mi nombre es "+nombre+" tengo "+edad+" años y mido "+altura);
    } 
}


