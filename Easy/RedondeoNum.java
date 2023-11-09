package Easy;
import java.util.Scanner;

public class RedondeoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        double num = scanner.nextDouble();
        System.out.println("El numero redondeado es " + Math.round(num));
    }
}

