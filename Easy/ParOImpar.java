package Easy;
import java.util.Scanner;

public class ParOImpar {
    
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = number.nextInt(); 

        if (numero % 2 == 0) {
        System.out.println("El numero es par");
        } else {
        System.out.println("El numero es impar");
        }
    }
}