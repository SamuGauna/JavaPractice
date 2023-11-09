package Easy;
import java.util.Scanner;

public class Descuento {
     public static void main(String[] args) throws Exception {
        Scanner pass = new Scanner(System.in);
       System.out.println("Ingrese el precio de su producto");
        int priceProduct = pass.nextInt();
        int priceOferta = priceProduct*10/100;
        if (priceProduct>=100) {
            System.out.println("Se aplico un descuento del %10 a su producto y quedo en: $" + (priceProduct - priceOferta));
        } else {
            System.out.println("No se aplico descuento a su producto y su precio quedo en: $" + priceProduct);
        }
    }
}
