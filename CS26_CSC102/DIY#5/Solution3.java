import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int target = 0;
        // take first row sum as target
        for (int j = 0; j < n; j++) {
            target += arr[0][j];
        }

        boolean magic = true;
        // diagonals
        int d1 = 0, d2 = 0;

        // check rows & columns
        for (int i = 0; i < n && magic; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
                col += arr[j][i];
            }
            if (row != target || col != target)
                magic = false;
            d1 += arr[i][i];
            d2 += arr[i][n - 1 - i];
        }

        if (d1 != target || d2 != target) {
            magic = false;
        }

        System.out.println(magic);
        sc.close();
    }
}
