/*
Crea un programa que gestione el inventario de una tienda. 
Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
*/
package soluciones;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String productos[] = {"Enlatados", "Frutas  ", "Vegetales", "Carnes   "};
        int limProductos = 4;
        int columnas = 2;
        double matInventario[][] = new double[limProductos][columnas];
        for (int i = 0; i < limProductos; i++) {
            matInventario[0][0] = 2.00;
            matInventario[1][0] = 0.50;
            matInventario[2][0] = 0.75;
            matInventario[3][0] = 3.50;
            for (int j = 0; j < columnas; j++) {
                matInventario[0][1] = 10;
                matInventario[1][1] = 8;
                matInventario[2][1] = 12;
                matInventario[3][1] = 4;
            }
        }
        System.out.println("¿Que producto busca?");
        nombre = teclado.nextLine();
        for (int i = 0; i < productos.length; i++) {
            String buscarProd = productos[i];
            
            if (buscarProd.startsWith(nombre)) {
                System.out.println("Si hay ese producto en el inventario"+"\n");
                
            }else{
                System.out.println("No hay ese producto en el inventario");
            }
                System.out.println("Producto        |Precio | Cantidad"+"\n");
                for ( i = 0; i < limProductos; i++) {
                    System.out.printf(productos[i] + "\t");
                    for (int j = 0; j < columnas; j++) {
                        System.out.printf("| %.2f \t", matInventario[i][j]);
                    }
                    System.out.println("");
                }
                break;
            
        }         
    }
}

