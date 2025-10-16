import java.util.*;

public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String e = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        String[] bank = new String[n];
        for (int i = 0; i < n; i++) {
            bank[i] = sc.nextLine();
        }

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != e.charAt(i)) {
                count++;
            }
        }

        if (count > n) {
            System.out.print(-1);
        } else {
            System.out.print(count);
        }
        sc.close();
    }
}
