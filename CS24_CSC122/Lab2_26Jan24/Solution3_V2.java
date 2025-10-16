import java.util.Scanner;

public class Solution3_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        char[] sc1 = s1.toCharArray();
        char[] sc2 = s2.toCharArray();

        int len1 = s1.length();
        int len2 = s2.length();
        StringBuilder result = new StringBuilder();
        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                result.append(sc1[i]).append(sc2[len2 - 1 - i]);
            }
        } else if (len1 > len2) {
            for (int i = 0; i < len2; i++) {
                result.append(sc1[i]).append(sc2[len2 - 1 - i]);
            }
            for (int i = len2; i < len1; i++) {
                result.append(sc1[i]);
            }
        } else {
            for (int i = 0; i < len1; i++) {
                result.append(sc1[i]).append(sc2[len2 - 1 - i]);
            }
            for (int i = len1; i < len2; i++) {
                result.append(sc2[len2 - 1 - i]);
            }
        }

        System.out.println(result);

    }
}