import java.util.Random;
import java.util.Scanner;

public class Lesson6Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Матриця M х N");
        System.out.print("Введіть розмір M (строки): ");
        int m = 0;
        try {
            m = scan.nextInt();
        }  catch (Exception e) {
            System.out.println("Помилка. Це не число.");
            System.exit(0);
        }
        System.out.print("Введіть розмір N (столбці): ");
        int n = 0;
        try {
            n = scan.nextInt();
        }  catch (Exception e) {
            System.out.println("Помилка. Це не число.");
            System.exit(0);
        }
        int[][] matrixI = new int[m][n];
        Random rnd = new Random();
        System.out.println("Вихідна матриця " + m + " x " + n + ":");
        for (int i = 0; i < matrixI.length; i++) {
            for (int j = 0; j < matrixI[i].length; j++) {
                matrixI[i][j] = rnd.nextInt(100);
                System.out.print(matrixI[i][j]);
                if (j < matrixI[i].length-1)
                    System.out.print(", ");
            }
            System.out.println();
        }

        int[][] matrixT = new int[n][m];
        System.out.println("Транспонована матриця " + n + " x " + m + ":");
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                matrixT[i][j] = matrixI[j][i];
                System.out.print(matrixT[i][j]);
                if (j < matrixT[i].length-1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }
}
