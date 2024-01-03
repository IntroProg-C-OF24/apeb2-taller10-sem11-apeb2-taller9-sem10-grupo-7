package soluciones_axel_introprog;
public class Problema9 {
    public static void main(String[] args) {
        //Hecho por Axel Roman :3
        int limPiramide = 6;
        System.out.println("Resultado: ");
        for (int i = 0; i < limPiramide; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}