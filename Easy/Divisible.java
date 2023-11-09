package Easy;
import java.util.Scanner;

public class Divisible {
       public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

       System.out.println("Ingrese un número: ");
        int numero = number.nextInt();

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 5 y por 3.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es divisible por 5.");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else {
            System.out.println("El número no es divisible ni por 5 ni por 3.");
        }
    }
}
