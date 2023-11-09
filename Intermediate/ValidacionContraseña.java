package Intermediate;
import java.util.Scanner;

public class ValidacionContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña que contenga:  8 caracteres, mayuscula y minuscula, numero y caracter especial ");
        String contrasena = scanner.nextLine();

        boolean longitudValida = contrasena.length() >= 8;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneNumero = true;
            } else if (!Character.isLetterOrDigit(caracter)) {
                tieneCaracterEspecial = true;
            }
        }

        if (longitudValida && tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }
}
