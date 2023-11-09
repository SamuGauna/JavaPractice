package Intermediate;
import java.util.Scanner;

public class ExtraccionSubcadena {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println("Ingrese un numero de indice inicial");
        int numeroInicial = scanner.nextInt();
        System.out.println("Ingrese un numero de indice final");
        int numeroFinal = scanner.nextInt();
        System.out.println("Resultado: " + frase.substring(numeroInicial, numeroFinal));
    }
}
