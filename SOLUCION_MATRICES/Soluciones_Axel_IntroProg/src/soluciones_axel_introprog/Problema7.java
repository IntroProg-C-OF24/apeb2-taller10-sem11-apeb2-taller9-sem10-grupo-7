package soluciones_axel_introprog;
public class Problema7 {
    public static void main(String[] args) {
        //Hecho por Axel Roman :3
        int limMat = 3;
        int mat[][] = new int[limMat][limMat];
        for (int i = 0; i < limMat; i++) {
            for (int j = 0; j < limMat; j++) {
                mat[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < limMat; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j);
            }
        }
        System.out.println("Diagonal Secundaria: ");
        int j = (mat.length) - 1;
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][j--] + "\t");
        }
        System.out.println("Elementos encima de la diagonal Secundaria");
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat.length - 1 - i; k++) {
                System.out.print(mat[i][k] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Elementos debajo de la diagonal Secundaria ");
        for (int i = 1; i < mat.length; i++) {
            for (int k = mat.length - i; k < mat.length; k++) {
                System.out.print(mat[i][k] + "\t");
            }
            System.out.println("");
        }
    }
}