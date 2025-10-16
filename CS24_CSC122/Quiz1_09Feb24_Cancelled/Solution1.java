import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().toLowerCase();
        str = str.replace("to", "2")
                .replace("for", "4")
                .replace("a", "6")
                .replace("e", "3")
                .replace("i", "1")
                .replace("o", "0")
                .replace("s", "5");
        System.out.println(str);
        sc.close();
    }
}