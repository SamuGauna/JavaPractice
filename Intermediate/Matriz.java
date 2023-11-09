package Intermediate;


public class Matriz {
     public static void main(String[] args) {
        int[][] matriz = {{5, 3, 2}, {8, 1, 5}, {9, 4, 7}};

System.out.println("Matriz original:");
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

System.out.println("\nArreglo:");
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print("[" + matriz[i][j] + "] ");
    }
    System.out.println();
}

    }
}
