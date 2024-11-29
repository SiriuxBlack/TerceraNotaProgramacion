class animales{
    String nombre;
    String sonido;
    String alimentacion;
}
public class ExprimentaReasignacionReferancia {
    public static void main(String[] args) {
        String nombre = "Vaca";
        String sonido= "Muuu";
        String alimentacion = "Hervivoras";
        System.out.println("La "+nombre+" hace "+sonido+" y es "+alimentacion);
        animales(nombre, sonido, alimentacion);
    }
    public static void animales(String nombre,String sonido,String alimentacion){
        nombre = "Lobo";
        sonido= "AUUUUUU";
        alimentacion = "Carnivoros";
        System.out.println("El "+nombre+" hace "+sonido+" y es "+alimentacion);
    }
}