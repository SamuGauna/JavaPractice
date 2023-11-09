package Easy;
import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = scanner.nextInt();
        System.out.println("El numero absoluto es: " + Math.abs(num));

    }
}
