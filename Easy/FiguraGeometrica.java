package Easy;
import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) throws Exception {
        Scanner pass = new Scanner(System.in);
    System.out.println("Seleccione un numero del 1 al 3");
        int numb = pass.nextInt();
        switch (numb) {
            case 1:
                System.out.println("La figura seleccionada es un Circulo");
                break;
            case 2: 
                System.out.println("La figura seleccionada es un Cuadrado");
                break;
            default:
                System.out.println("La figura seleccionada es un Triangulo");
                break;
        }
    }
}
