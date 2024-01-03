
package soluciones;

public class Ejercicio8 {
    public static void main(String[] args) {
        int limMatriz=4;
        int mt[][]=new int [limMatriz][limMatriz];
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                mt[i][j] = (int) (Math.random() * (-9 - 9 + 1) + 9);
            }
        }    
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                System.out.print(mt[i][j]+"\t");
            }   
            System.out.println("");    
        }
        System.out.print("\n"+"Diagonal Principal "+"\n");
        for (int i = 0; i < mt.length; i++) {
            System.out.println(mt[i][i]+ "\t");  
        }
        System.out.print("\n"+"Elementos bajo la diagonal principal" );
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mt[i][j]+ "\t");   
            }
            System.out.println(" ");
        }
        System.out.print("\n"+"Elementos sobre la diagonal principal" );
        for (int j = 0; j < mt.length; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(mt[i][j]+ "\t");   
            }
            System.out.println(" ");
        }
        /*for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt.length; j++) {
                if (j>i);
            }  
        }*/
    }
    
}
    
    
