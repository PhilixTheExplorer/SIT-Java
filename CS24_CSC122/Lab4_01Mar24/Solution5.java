import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        double[] rowSum = new double[r];
        double[] colSum = new double[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int num = sc.nextInt();
                rowSum[i] += num;
                colSum[j] += num;
            }
        }

        System.out.println("Average of each row:");
        for (double x : rowSum) {
            System.out.print((x/c) + " ");
        }
        System.out.println();
        System.out.println("Average of each column:");
        for (double x : colSum) {
            System.out.print((x/r) + " ");
        }
    }
}
