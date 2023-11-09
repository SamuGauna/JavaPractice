package Easy;
import java.util.Scanner;


public class MayusculasOMinusculas {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto");
        String frase = scanner.nextLine();
        System.out.println("Lo prefiere en 1-Mayuscula o 2-Minuscula ?");
        int resp = scanner.nextInt();
        if (resp == 1) {
            System.out.println(frase.toUpperCase());
        } else if(resp == 2) {
            System.out.println(frase.toLowerCase());
        } else{
            System.out.println("La opcion indicada no es correcta");
        }
        
    }
}
