package Intermediate;
public class SumaMatriz {
      public static void main(String[] args) {
        int[][] matriz = {{5, 3, 2}, {8, 1, 5}, {9, 4, 7}};
        int suma = 0;
System.out.println("Suma matriz:");
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        suma += matriz[i][j] ;
    }
} System.out.println("La suma de todos los elementos de la matriz es: " + suma);
      }
}
