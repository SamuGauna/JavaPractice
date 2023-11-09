import java.util.Scanner;

public class JuegoOthello {
    public char[][] tablero;
    public char jugadorActual;

    public JuegoOthello() {
        tablero = new char[8][8];
        jugadorActual = 'B'; // 'B' para el jugador negro, 'W' para el jugador blanco
        inicializarTablero();
    }

    public void inicializarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '-';
            }
        }

        tablero[3][3] = 'W';
        tablero[3][4] = 'B';
        tablero[4][3] = 'B';
        tablero[4][4] = 'W';
    }

    public void imprimirTablero() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean movimientoValido(int fila, int columna) {
        if (fila < 0 || fila >= 8 || columna < 0 || columna >= 8 || tablero[fila][columna] != '-') {
            return false;
        }

        char colorOponente = (jugadorActual == 'B') ? 'W' : 'B';
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] direccion : direcciones) {
            int nuevaFila = fila + direccion[0];
            int nuevaColumna = columna + direccion[1];
            boolean encontradoColorOponente = false;

            while (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8 && tablero[nuevaFila][nuevaColumna] == colorOponente) {
                nuevaFila += direccion[0];
                nuevaColumna += direccion[1];
                encontradoColorOponente = true;
            }

            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8 && tablero[nuevaFila][nuevaColumna] == jugadorActual && encontradoColorOponente) {
                return true;
            }
        }

        return false;
    }

    public void realizarMovimiento(int fila, int columna) {
        tablero[fila][columna] = jugadorActual;
        voltearFichasOponente(fila, columna);
        jugadorActual = (jugadorActual == 'B') ? 'W' : 'B';
    }

    public void voltearFichasOponente(int fila, int columna) {
        char colorOponente = (jugadorActual == 'B') ? 'W' : 'B';
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        for (int[] direccion : direcciones) {
            int nuevaFila = fila + direccion[0];
            int nuevaColumna = columna + direccion[1];
            boolean encontradoColorOponente = false;
            boolean encontradoColorActual = false;

            while (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8 && tablero[nuevaFila][nuevaColumna] == colorOponente) {
                nuevaFila += direccion[0];
                nuevaColumna += direccion[1];
                encontradoColorOponente = true;
            }

            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8 && tablero[nuevaFila][nuevaColumna] == jugadorActual && encontradoColorOponente) {
                encontradoColorActual = true;
            }

            if (encontradoColorActual) {
                while (nuevaFila != fila || nuevaColumna != columna) {
                    nuevaFila -= direccion[0];
                    nuevaColumna -= direccion[1];
                    tablero[nuevaFila][nuevaColumna] = jugadorActual;
                }
            }
        }
    }

    public boolean esFinDeJuego() {
        // El juego termina si no hay movimientos válidos para el jugador actual
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (movimientoValido(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void determinarGanador() {
        int contadorNegras = 0;
        int contadorBlancas = 0;

        // Contar el número de fichas de cada color
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == 'B') {
                    contadorNegras++;
                } else if (tablero[i][j] == 'W') {
                    contadorBlancas++;
                }
            }
        }

        System.out.println("Fin del juego.");
        System.out.println("Fichas negras: " + contadorNegras);
        System.out.println("Fichas blancas: " + contadorBlancas);

        if (contadorNegras > contadorBlancas) {
            System.out.println("¡El jugador negro gana!");
        } else if (contadorBlancas > contadorNegras) {
            System.out.println("¡El jugador blanco gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!esFinDeJuego()) {
            System.out.println("Turno del jugador " + jugadorActual);
            imprimirTablero();

            System.out.print("Ingrese la fila (0-7): ");
            int fila = scanner.nextInt();

            System.out.print("Ingrese la columna (0-7): ");
            int columna = scanner.nextInt();

            if (movimientoValido(fila, columna)) {
                realizarMovimiento(fila, columna);
            } else {
                System.out.println("Movimiento inválido. Inténtalo nuevamente.");
            }
        }

        imprimirTablero();
        determinarGanador();
    }

    public static void main(String[] args) {
        JuegoOthello juego = new JuegoOthello();
        juego.jugar();
    }
}