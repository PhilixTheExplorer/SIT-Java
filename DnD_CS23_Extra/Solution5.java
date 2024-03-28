import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next().toUpperCase();
            char[] cArray = word.toCharArray();
            Arrays.sort(cArray);
            String sortedWord = "";
            for (char c : cArray) {
                sortedWord += c + "";
            }
            System.out.print(sortedWord + " ");
        }
        sc.close();
    }
}
