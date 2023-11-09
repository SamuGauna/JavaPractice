package Easy;
import java.util.Scanner;

public class SearchCharacter {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String frase = scanner.nextLine();
        System.out.println("Ingrese un caracter");
        char caracter = scanner.next().charAt(0);
        int indice = frase.indexOf(caracter);
        if (indice != -1) {
            System.out.println("El caracter " + caracter + " SI se encuentra en la palabra");
        } else {
            System.out.println("El caracter: " + caracter + "NO se encuentra en la palabra");
        }
        
    }
}