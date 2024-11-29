class Rectangulo{
    int ancho;
    int alto;
    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}
public class RectanguloMetodo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 8);
        System.out.println("Antes de modificarlo = ancho= " + rectangulo.ancho + ", alto = " + rectangulo.alto);
        ModificarRectangulo(rectangulo );
    }
    public static void ModificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 30;
        System.out.println("En el metodo = ancho= "+r.ancho + ", alto = " + r.alto);
    }
}