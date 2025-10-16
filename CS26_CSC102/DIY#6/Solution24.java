import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        // Convert wildcard pattern to regex
        String regex = p.replace(".", "\\.") // escape dot
                .replace("*", ".*")
                .replace("?", ".");

        boolean matches = s.matches(regex);
        System.out.println(matches);
        sc.close();
    }
}
