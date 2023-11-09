package Intermediate;
import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria {
    public static int[][] crearMatriz(int tamaño, int valor_minimo, int valor_maximo) {
        int[][] matriz = new int[tamaño][tamaño];
        Random rand = new Random();
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = rand.nextInt((valor_maximo - valor_minimo) + 1) + valor_minimo;
            }
        }
        return matriz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamaño = scanner.nextInt();
        System.out.print("Ingrese el valor mínimo permitido para los elementos: ");
        int valor_minimo = scanner.nextInt();
        System.out.print("Ingrese el valor máximo permitido para los elementos: ");
        int valor_maximo = scanner.nextInt();

        int[][] matriz = crearMatriz(tamaño, valor_minimo, valor_maximo);

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


}