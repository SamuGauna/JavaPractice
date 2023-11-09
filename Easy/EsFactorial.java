package Easy;
import java.util.Scanner;

public class EsFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= num);
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
