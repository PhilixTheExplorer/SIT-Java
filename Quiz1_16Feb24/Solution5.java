import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        String rotorInput1 = sc.nextLine();
        String rotorInput2 = sc.nextLine();
        String rotorInput3 = sc.nextLine();

        String firstRotor = rotorInput1;
        String secondRotor = rotorInput2;
        String thirdRotor = rotorInput3;
        int firstCycle = 0;
        int secondCycle = 0;
        int thirdCycle = 0;
        /*
         * --Use StringBuilder instead of string--
         * efficient especially in loops
         * efficient for character concatenation
         */
        StringBuilder encryptedText = new StringBuilder();

        /*
         * For each loop is better here
         * We need character
         */
        for (char currentChar : input.toCharArray()) {
            if (Character.isLetter(currentChar)) {
                int firstIndex = currentChar - 'A';
                int secondIndex = firstRotor.charAt(firstIndex) - 'A';
                int thirdIndex = secondRotor.charAt(secondIndex) - 'A';
                char encryptedChar = thirdRotor.charAt(thirdIndex);

                // Append encrypted character to encryptedText
                encryptedText.append(encryptedChar);

                // Rotate rotors
                firstCycle++;
                firstRotor = rotorInput1.substring(firstCycle) + rotorInput1.substring(0, firstCycle);

                /*
                 * --substring logic was correct but--
                 * --control flow logic was wrong in mine--
                 * --Used Ye Phone Kyaw's Control Flow Logic--
                 */
                if (firstCycle == 26) {
                    firstCycle = 0;
                    secondCycle++;
                    secondRotor = rotorInput2.substring(secondCycle) + rotorInput2.substring(0, secondCycle);
                    if (secondCycle == 26) {
                        secondCycle = 0;
                        thirdCycle++;
                        thirdRotor = rotorInput3.substring(thirdCycle) + rotorInput3.substring(0, thirdCycle);
                        if (thirdCycle == 26) {
                            thirdCycle = 0;
                        }
                    }
                }
            } else {
                // Append non-alphabetic characters unchanged
                encryptedText.append(currentChar);
            }
        }
        sc.close();
        System.out.println(encryptedText.toString());
    }
}
