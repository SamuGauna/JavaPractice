package Intermediate;
public class GrandePequeñoMatriz {
    
      public static void main(String[] args) {
        int[][] matriz = {{5, 3, 2}, {8, 1, 5}, {9, 4, 7}};
        int max = matriz[0][0];
         int min = matriz[0][0];
System.out.println("Suma matriz:");
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
         if (matriz[i][j] > max) {
            max = matriz[i][j];
        }
        if (matriz[i][j] < min) {
            min = matriz[i][j];
        }
    }
} System.out.println("El número más grande en la matriz es: " + max);
System.out.println("El número más pequeño en la matriz es: " + min);
      }
}
