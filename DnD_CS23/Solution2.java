import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String word = sc.next().toLowerCase();
            if (i % 2 == 0) {
                word = word.toUpperCase();
            }
            StringBuilder w = new StringBuilder(word);
            word = w.reverse().toString();
            result.append(word).append(" ");
        }
        sc.close();
        System.out.println(result);
    }
}
