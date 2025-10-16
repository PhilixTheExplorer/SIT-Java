import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result ^= sc.nextInt(); // XOR all numbers
        }

        System.out.print(result);
        sc.close();
    }
}
