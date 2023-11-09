import java.util.Random;
import java.util.Scanner;

public class BatallaNaval {
    
      public static void main(String[] args) {
        char[][] computadora = {{'~', '~','~', '='},{'~', '~', '=', '~'}};
        char[][] jugador = {{'~','=','~','~'},{'=', '~', '=', '~'}};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una coordenada(Primero fila y despues columna)");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();
        

        if(computadora[fila][columna]== '='){
            computadora[fila][columna] = 'X';
        } else{
            computadora[fila][columna] = 'N';
        }

        System.out.print(computadora[0]);
        System.out.println();
        System.out.print(computadora[1]);
        System.out.println();
        System.out.print(jugador[0]);
        System.out.println();
        System.out.print(jugador[1]);


    Random rand = new Random();
        int numeroCompu = rand.nextInt(2);

        
        if(jugador[numeroCompu][numeroCompu]== '='){
            jugador[numeroCompu][numeroCompu] = 'X';
        } else{
            jugador[numeroCompu][numeroCompu] = 'N';
        }
        System.out.println();
        System.out.print(jugador[0]);
        System.out.println();
        System.out.print(jugador[1]);

         System.out.println("Volve a atacar(Fila y columna)");
        int ataqueFila2 = scanner.nextInt();
            int ataqueColumna2 = scanner.nextInt();
            if(computadora[ataqueFila2][ataqueColumna2]== '='){
            computadora[ataqueFila2][ataqueColumna2] = 'X';
            } else{
                computadora[ataqueFila2][ataqueColumna2] = 'N';
            }

        if (computadora[0][3] == 'X' && computadora[1][2] == 'X' ) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Te faltan barcos por derribar");
        }

}}

