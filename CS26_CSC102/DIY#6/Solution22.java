import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        String compressedStr = compressed.toString();
        String result = compressedStr.length() < str.length() ? compressedStr : str;
        System.out.println(result);
        sc.close();
    }
}