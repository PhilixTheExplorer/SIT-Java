import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i < m - 1 && matrix[i][j] != matrix[i + 1][j]) {
                    flag = false;
                    break;
                }

                if (j < n - 1 && matrix[i][j] == matrix[i][j + 1]) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.print(flag);
        sc.close();
    }
}