package soluciones_axel_introprog;
import java.util.Scanner;
public class Problema3 {
        public static void main(String[] args) {
            //Hecho por Axel Roman :3
        Scanner teclado = new Scanner (System.in);
        double total= 0.0;
        double totalConIVA = 0.0;
        double descuento = 0.0;
        String[][] inventario = {
                {"001", "Gaseosas", "1.0", "100"},
                {"002", "Picaditas", "1.0", "100"},
                {"003", "Alcohol ", "2.5", "100"},
        };
        System.out.println("CÓDIGO | PRODUCTO | PRECIO | CANTIDAD");
        for (String[] producto : inventario) {
            System.out.println(producto[0] + "\t" + producto[1] + "\t" + producto[2] + "\t" + producto[3]);
        }
        System.out.println("Ingrese el código del producto:");
        String codigoProducto = teclado.nextLine();
        System.out.println("Ingrese la cantidad deseada:");
        int cantidadDeseada = teclado.nextInt();
        boolean productoEncontrado = false;
        for (String[] producto : inventario) {
            if (producto[0].equals(codigoProducto)) {
                productoEncontrado = true;
                double precioUnitario = Double.parseDouble(producto[2]);
                int cantidadDisponible = Integer.parseInt(producto[3]);
                if (cantidadDeseada > cantidadDisponible) {
                    System.out.println("Disculpe, se ha agotado este producto");
                    return;
                }
                total+= cantidadDeseada * precioUnitario;
                if (total > 100.0) {
                    descuento = total * 0.1; // Descuento del 10%
                }
                totalConIVA = total* 1.12; // Agregar el 12% de IVA
                break;
            }
        }
        if (!productoEncontrado) {
            System.out.println("Disculpe, no poseemos este producto");
        } else {
            System.out.println("FACTURA");
            System.out.println("============================");
            System.out.println("Producto: " + inventario[0][1]);
            System.out.println("Cantidad: " + cantidadDeseada);
            System.out.println("Precio por unidades: $" + inventario[0][2]);
            System.out.println("Total: $" + total);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total Con IVA: $" + totalConIVA);
            System.out.println("====================================");
        }
    }
}