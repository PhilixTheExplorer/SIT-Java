import java.util.Scanner;
import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s2.isEmpty()) {
            s2 = sc.nextLine();
        }
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2r = new StringBuilder(s2).reverse();
        int len1 = s1.length();
        int len2 = s2.length();
        int min = len1 < len2 ? len1 : len2;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < min; i++) {
            result.append(sb1.charAt(i)).append(sb2r.charAt(i));
        }
        if (len1 < len2) {
            result.append(sb2r.substring(min));
        } else {
            result.append(sb1.substring(min));
        }
        System.out.println(result);
    }
}
