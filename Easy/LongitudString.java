package Easy;
import java.util.Scanner;

public class LongitudString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto ");
        String cadena = scanner.nextLine();
        System.out.println("La longitud de esa cadena es de: " + cadena.length());
    }
}
