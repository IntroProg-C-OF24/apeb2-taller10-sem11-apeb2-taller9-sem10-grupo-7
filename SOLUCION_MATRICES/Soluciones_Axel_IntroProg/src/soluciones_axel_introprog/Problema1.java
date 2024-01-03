package Soluciones_axel_introprog;
public class Problema1 {
    public static void main(String[] args) {
        //Hecho por Axel Roman :3
        int limEst = 28, limNotas = 3;
        double matNotas[][] = new double[limEst][limNotas];
        double arrProm[] = new double[limEst];
        double promedio = 0, sumaPro = 0, notaMax, notaMin;
        for (int i = 0; i < limEst; i++) {
            for (int j = 0; j < limNotas; j++) {
                matNotas[i][j] = (double) (Math.random() * (9 - 0 + 1) + 0);
            }
        }
        for (int i = 0; i < limEst; i++) {
            arrProm[i] = (matNotas[i][0] * 0.35) + (matNotas[i][1] * 0.35) + (matNotas[i][2] * 0.35);
            sumaPro += arrProm[i];
            promedio = (sumaPro / limEst);
        }
        System.out.println("Nombres | ACD | APE | AA | Promedio");
        for (int i = 0; i < limEst; i++) {
            System.out.printf("Estudiante " + i + "\t");
            for (int j = 0; j < limNotas; j++) {
                System.out.printf("| %.2f \t", matNotas[i][j]);
            }
            System.out.printf("| %.2f \t", arrProm[i]);
            System.out.println("");
        }
        System.out.println("Promedio: ");
        System.out.printf("%.2f ", promedio);
        System.out.println("");
        System.out.println("Estudiantes encima del promedio");
        System.out.println("");
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i] > promedio) {
                System.out.printf("Estudiante " + i + "\t");
                System.out.printf("| %.2f \t", arrProm[i]);
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("Estudiantes debajo del promedio");
        System.out.println("");
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i] < promedio) {
                System.out.printf("Estudiante " + i + "\t");
                System.out.printf("| %.2f \t", arrProm[i]);
                System.out.println("");
            }
        }
        notaMax=arrProm[0];
        notaMin=arrProm[0];
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i]>notaMax){
                notaMax = arrProm[i];
            }
            if (arrProm[i]<notaMin){
                notaMin = arrProm[i];
            }
        }
        System.out.println("");
        System.out.println("Estudiante con la nota Mayor: ");
        System.out.printf("%.2f ", notaMax);
        System.out.println("");
        System.out.println("Estudiante con la nota Menor: ");
        System.out.printf("%.2f ", notaMin);
    }
}