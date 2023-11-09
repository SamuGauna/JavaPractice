package Intermediate;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean found = false;
        int i = 0;
        while (i < array.length && !found) {
            if (array[i] == num) {
                found = true;
            }
            i++;
        }
        if (found) {
            System.out.println("El número está presente en el array.");
        } else {
            System.out.println("El número no está presente en el array.");
        }
    }
}

