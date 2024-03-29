import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char[] cArr = str.toCharArray();
            int index = 0;
            char[] newArr = new char[cArr.length];
            for (int j = 1; j < cArr.length; j += 2) {
                newArr[index++] = Character.toLowerCase(cArr[j]);
            }
            for (int j = 0; j < cArr.length; j += 2) {
                newArr[index++] = Character.toUpperCase(cArr[j]);
            }
            for (char c : newArr) {
                System.out.print(c);
            }
            System.out.print(" ");
        }
        sc.close();
    }
}