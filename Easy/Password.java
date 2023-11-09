package Easy;
import java.util.Scanner;

public class Password {
     public static void main(String[] args) throws Exception {
        Scanner pass = new Scanner(System.in);
        String contraseñaPredefinida = "admin123";
       System.out.println("Ingrese su contraseña ");
        String passwordIngresada = pass.nextLine();

        if (passwordIngresada.equals(contraseñaPredefinida)) {
            System.out.println("Acceso concedido.");
        } else {
             System.out.println("Acceso denegado.");
        }

        
    }
}
