import java.io.*;
import java.util.Scanner;
public class ArchivoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Escribe La nota que desees: ");
            String nota = sc.nextLine();
            FileWriter escritor = new FileWriter("notas.txt", true);
            escritor.write(nota + "\n");
            escritor.close();
            System.out.println("La nota se ha guardado");
            BufferedReader lector = new BufferedReader(new FileReader("notas.txt"));
            System.out.println("\nTus notas:");
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}