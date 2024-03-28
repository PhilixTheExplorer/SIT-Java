import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            String word = sc.next().toLowerCase();
            int len = word.length() - 1;
            String first = word.charAt(0) + "";
            String last = word.charAt(len) + "";
            word = last + word.substring(1, len) + first;
            strArray[n - 1 - i] = word;
        }
        for (String word : strArray) {
            System.out.print(word + " ");
        }
        sc.close();
    }
}
