package Easy;
import java.util.Scanner;

public class ConversionCalificaciones {
    public static void main(String[] args) throws Exception {
        Scanner pass = new Scanner(System.in);
    System.out.println("Coloque una calificacion");
        int numb = pass.nextInt();
        switch (numb) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2: 
                System.out.println("Deficiente");
                break;
            case 3: 
                System.out.println("Suficiente");
                break;
            case 4: 
                System.out.println("Notable");
                break;
            default:
                System.out.println("Sobresaliente");
                break;
        }
    }
}
