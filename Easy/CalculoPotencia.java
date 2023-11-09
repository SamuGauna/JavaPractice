package Easy;
import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base = pass.nextInt();
        System.out.println("Ingrese el exponente");
        int exponente = pass.nextInt();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado de elevar "+base+ " a la potencia " +exponente+ " es "+ resultado);


        
    }
}
