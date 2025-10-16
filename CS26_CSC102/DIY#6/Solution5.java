import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            String lowerPart = "";
            String upperPart = "";

            // Loop through each character
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (j % 2 == 0) {
                    upperPart += Character.toUpperCase(ch); // even index -> uppercase
                } else {
                    lowerPart += Character.toLowerCase(ch); // odd index -> lowercase
                }
            }

            System.out.print(lowerPart + upperPart + " ");
        }

        sc.close();
    }
}