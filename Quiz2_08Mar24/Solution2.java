import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    upper += arr[i][j];
                }
                if (i >= j) {
                    lower += arr[i][j];
                }
            }
        }

        System.out.println(upper);
        System.out.println(lower);
        sc.close();
    }
}