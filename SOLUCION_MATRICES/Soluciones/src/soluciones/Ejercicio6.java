
package soluciones;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limMatriz = 3;
        int matriz1[][] = new int[limMatriz][limMatriz];
        int matriz2[][] = new int[limMatriz][limMatriz];
        int operacion;
        int respuesta[][] = new int[limMatriz][limMatriz];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        
        System.out.println("Primera Matriz: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("Segunda Matriz: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Ingrese 1 para sumar las matrices ");
        System.out.println("Ingrese 2 para restar las matrices");
        operacion = teclado.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("Respuesta: ");
                for (int i = 0; i < respuesta.length; i++) {
                    for (int j = 0; j < respuesta.length; j++) {
                        respuesta[i][j] = matriz1[i][j] + matriz2[i][j];
                        System.out.print(respuesta[i][j] + "\t");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Respuesta: ");
                for (int i = 0; i < respuesta.length; i++) {
                    for (int j = 0; j < respuesta.length; j++) {
                        respuesta[i][j] = matriz1[i][j] - matriz2[i][j];
                        System.out.print(respuesta[i][j] + "\t");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
