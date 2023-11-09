package Intermediate;
import java.util.Scanner;

public class IsPrime {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean esPrimo = true;
        int i = 2;
        do {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
            i++;
        } while (i <= num / 2);
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }
}

