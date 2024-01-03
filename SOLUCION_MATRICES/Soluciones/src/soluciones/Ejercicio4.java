package soluciones;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean partida = true;
        char jugador = 'X';
        int fila = 0, columna = 0;
        while (partida) {
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
            if (jugador == 'X') {
                jugador = 'O';
            } else {
                jugador = 'X';
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + "Jugador " + jugador);
            System.out.println("Ingresa la posición de la fila y columna");
            fila = scanner.nextInt();
            columna = scanner.nextInt();
            tablero[fila][columna] = jugador;
            for (int i = 0; i < 3; i++) {
                if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
                        || (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                    partida = false;
                    System.out.println("Ganó " + jugador);

                }
                if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
                        || (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
                    partida = false;
                    System.out.println("Ganó " + jugador);
                    break;
                }
            }
            boolean empate = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        empate = false;
                        break;
                    }
                }
            }
            if (empate) {
                partida = false;
                System.out.println("Hubo empate");
            }
        }
    }
}
