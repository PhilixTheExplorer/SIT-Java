import java.util.Scanner;

public class Solution5_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        String rotor1 = sc.nextLine();
        String rotor2 = sc.nextLine();
        String rotor3 = sc.nextLine();

        int rotor1Position = 0;
        int rotor2Position = 0;
        int rotor3Position = 0;

        StringBuilder encryptedText = new StringBuilder();
        /*
         * Data Structure Class' Queue Logic can be also applied here
         * This one can give better solution
         * Hard to see tho
         * Get help from GPT lol
         */
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'A';

                // Pass through rotor 1
                index = (index + rotor1Position) % 26;
                index = rotor1.charAt(index) - 'A';

                // Pass through rotor 2
                index = (index + rotor2Position) % 26;
                index = rotor2.charAt(index) - 'A';

                // Pass through rotor 3
                index = (index + rotor3Position) % 26;
                index = rotor3.charAt(index) - 'A';

                // Convert index back to character
                char encryptedChar = (char) (index + 'A');

                // Append encrypted character to encryptedText
                encryptedText.append(encryptedChar);

                // Rotate rotors
                rotor1Position = (rotor1Position + 1) % 26;
                if (rotor1Position == 0) {
                    rotor2Position = (rotor2Position + 1) % 26;
                    if (rotor2Position == 0) {
                        rotor3Position = (rotor3Position + 1) % 26;
                    }
                }
            } else {
                // Append non-alphabetic characters unchanged
                encryptedText.append(c);
            }
        }
        sc.close();
        System.out.println(encryptedText.toString());
    }
}
