import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] num = new String[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.next();
        }
        int count = 0;
        for (String x : num) {
            StringBuilder sb = new StringBuilder(x);
            if (x.equals(sb.reverse().toString())) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}