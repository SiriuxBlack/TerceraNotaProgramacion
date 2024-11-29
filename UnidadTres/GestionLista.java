import java.util.ArrayList;
import java.util.List;
public class GestionLista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        try {
            System.out.println(lista.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR");
            System.out.println("Esta fuer de los indicies de la lista");
        }
    }
}
