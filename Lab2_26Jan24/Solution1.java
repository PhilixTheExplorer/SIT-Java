import java.util.Scanner;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().toLowerCase().split(" ");
        String result = "";
        for (String x : input) {
            result += x;
        }
        char[] r = result.toCharArray();
        Arrays.sort(r);
        for (char c : r) {
            System.out.print(c);
        }
    }
}
