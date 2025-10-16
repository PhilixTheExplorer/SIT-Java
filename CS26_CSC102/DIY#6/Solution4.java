import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                if (i == j)
                    d1 += val;
                if (i + j == n - 1)
                    d2 += val;
            }
        }
        System.out.println(Math.abs(d1 - d2));
        sc.close();
    }
}
