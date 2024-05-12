import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next().toLowerCase();
            char firstChar = Character.toUpperCase(word.charAt(word.length() - 1));
            StringBuilder reversedWord = (new StringBuilder(word.substring(0, word.length() - 1))).reverse();
            System.out.print(firstChar + reversedWord.toString() + " ");
        }
        sc.close();
    }
}
