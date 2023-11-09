package Easy;
import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo ya sea decimal o entero");
        double num = pass.nextDouble();
        if (num > 0) {
            double resultado = Math.sqrt(num);
            System.out.println("La raiz cuadrada de "+num+ " es "+ resultado); 
        } else {
            System.out.println("El numero ingresado no es positivo");
        }
        
    }
}
