package Easy;
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        System.out.println("Ingrese una calificacion");
        int numeroCalificacion = number.nextInt();

        if (numeroCalificacion <= 60){
            System.out.println("La Calificacion es F" );
        } else if(numeroCalificacion >=60 && numeroCalificacion <= 69){
            System.out.println("La calificacion es de D");
        } else if(numeroCalificacion >=70 && numeroCalificacion <= 79){
            System.out.println("La calificacion es de C");
        } else if(numeroCalificacion >=80 && numeroCalificacion <= 89){
            System.out.println("La calificacion es de B");
        } else if (numeroCalificacion >= 90){
            System.out.println("La calificacion es de A");
        }
    }
    }
