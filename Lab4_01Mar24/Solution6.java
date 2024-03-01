import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        if (c1 != r2)
            System.out.println("Invalid");
        else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            int product = 1;
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product = m1[i][k] * m2[k][j];
                        sum += product;
                    }
                    System.out.print(sum + " ");
                    sum = 0;
                }
            }
        }
    }
}
