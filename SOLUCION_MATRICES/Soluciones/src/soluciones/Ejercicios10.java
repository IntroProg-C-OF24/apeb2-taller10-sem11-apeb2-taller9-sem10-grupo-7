
package soluciones;

public class Ejercicios10 {
    public static void main(String[] args) {
         int limRombo=4;
        for (int i = 0; i < limRombo; i++) {
            for (int j = limRombo-1-i; j >= 0; j--) {
                System.out.print(" ");   
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");   
            }
            System.out.println(" ");
        }
        for (int i = 0; i < limRombo; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");   
            }
            for (int j = limRombo-i; j > 0; j--) {
                System.out.print("* ");   
            }
            
            System.out.println(" ");
        }
    }
    
}
    
        
    
