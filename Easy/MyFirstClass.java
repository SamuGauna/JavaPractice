package Easy;
import java.util.Scanner;

public class MyFirstClass {

    public static void main(String[] args) throws Exception {
        Scanner instClass = new Scanner(System.in);
        String miVariable = "Hola mundo";
        System.out.println(miVariable);
        System.out.println("Ingrese su edad");
        //nextint  Lee un número entero desde la entrada.
        int edad = instClass.nextInt();
        //nextLine Lee una línea completa de texto desde la entrada.
        instClass.nextLine();
        System.out.print("Ingrese nombre");
        String nombre = instClass.nextLine();
        System.out.println(nombre + edad);
        
        
    }
}
