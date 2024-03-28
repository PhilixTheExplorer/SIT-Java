import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = n - 5;
        int end = n + 5;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
