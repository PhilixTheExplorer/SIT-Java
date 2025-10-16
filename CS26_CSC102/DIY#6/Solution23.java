import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int[] columnSums = new int[m];

        // Read the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of each column
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                columnSums[j] += array[i][j];
            }
        }

        // Print the column sums
        for (int j = 0; j < m; j++) {
            System.out.println(columnSums[j]);
        }

        sc.close();
    }
}