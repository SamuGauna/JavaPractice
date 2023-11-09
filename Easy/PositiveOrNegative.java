package Easy;
import java.util.Scanner;

public class PositiveOrNegative {
     public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        System.out.println("Ingrese un numero negativo o positivo");
        int num = number.nextInt();

        if (num>0){
            System.out.println("El numero es positivo" );
        } else if(num<0){
            System.out.println("El numero es negativo");
        } else if (num==0){
            System.out.println("el numero es cero");
        }
    }
}
