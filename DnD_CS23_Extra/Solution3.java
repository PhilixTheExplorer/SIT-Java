import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        for (int i = 0; i < n; i++) {
            String word = sc.next().toLowerCase();
            char[] cArr = word.toCharArray();
            char tmp = cArr[0];
            cArr[0] = cArr[cArr.length - 1];
            cArr[cArr.length - 1] = tmp;
            String swappedString = "";
            for (char c : cArr) {
                swappedString += c + "";
            }
            strArray[n - 1 - i] = swappedString;
        }
        for (String word : strArray) {
            System.out.print(word + " ");
        }
        sc.close();
    }
}
