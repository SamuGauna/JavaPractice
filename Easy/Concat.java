package Easy;
import java.util.Scanner;

public class Concat {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();
        System.out.println("Usted es: " + nombre.concat(apellido));
    }
}