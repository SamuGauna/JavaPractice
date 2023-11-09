package Easy;
import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) throws Exception {
        Scanner pass = new Scanner(System.in);
    System.out.println("Diga un numero del 1 al 7");
        int numb = pass.nextInt();
        switch (numb) {
            case 1:
                System.out.println("Es Lunes y es un dia Habil");
                break;
            case 2: 
                System.out.println("Es Martes y es un dia Habil");
                break;
            case 3: 
                System.out.println("Es Miercoles y es un dia Habil");
                break;
            case 4: 
                System.out.println("Hoy es Jueves y es un dia Habil");
                break;
            case 5: 
                System.out.println("Es Viernes y es un dia Habil");
                break;
            case 6: 
                System.out.println("Es Sabado y no es un dia Habil");
                break;
            default:
                System.out.println("Es Domingo y no es un dia Habil");
                break;
        }
    }
}
