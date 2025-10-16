import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;

        double[][] m1 = new double[n][n];
        double[][] m2 = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m2[i][j] = sc.nextDouble();
            }
        }
        double sum = 0;
        double product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    product = m1[i][k] * m2[k][j];
                    sum += product;
                }
                System.out.print(sum + " ");
                sum = 0;
            }
            System.out.println();
        }
        sc.close();
    }
}