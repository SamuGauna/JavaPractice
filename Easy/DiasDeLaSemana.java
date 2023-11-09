package Easy;
import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) throws Exception {
        Scanner pass = new Scanner(System.in);
    System.out.println("Ingrese el numero de dia que quiere saber");
        int numbWeek = pass.nextInt();
        switch (numbWeek) {
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2: 
                System.out.println("El dia es Martes");
                break;
            case 3: 
                System.out.println("El dia es Miercoles");
                break;
            case 4: 
                System.out.println("El dia es Jueves");
                break;
            case 5: 
                System.out.println("El dia es Viernes");
                break;
            case 6: 
                System.out.println("El dia es Sabado");
                break;
            default:
                System.out.println("El dia es Domingo");
                break;
        }
    }
}
