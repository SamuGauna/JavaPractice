package Intermediate;
import java.util.Scanner;
public class Calculator {
    
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = number.nextInt();
        number.nextLine();
        System.out.println("Ingrese otro numero");
        int numero2 = number.nextInt();
        number.nextLine();

        System.out.println("Selecciona la operacion que desea realizar: 1-suma, 2-resta, 3-division, 4-Multiplicacion");
        int res = number.nextInt();
        if (res == 1){
            int totalSuma = numero1 + numero2;
            System.out.println("La suma de los numeros es de " + totalSuma );
        } else if(res == 2 ){
            int totalResta = numero1 - numero2;
            System.out.println("La resta de los numeros es de " + totalResta );
        } else if(res == 3 ){
            int totaldivision = numero1 / numero2;
            System.out.println("La division de los numeros es de " + totaldivision );
        } else if(res == 4 ){
            int totalResta = numero1 * numero2;
            System.out.println("La multiplicacion de los numeros es de " + totalResta );
        }
    }
    }
    

