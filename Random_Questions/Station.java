import java.util.Scanner;

public class Station {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numStation = sc.nextInt();

        int[] minToStation = new int[numStation];

        for (int i = 0; i < numStation; i++) {
            minToStation[i] = sc.nextInt();
        }
        int hour = 9;
        int min = 20;
        boolean isAm = true;

        for (int i = 0; i < numStation; i++) {
            min += minToStation[i];
            hour += min / 60;
            min %= 60;

            while (hour > 12) {
                hour -= 12;
                isAm = !isAm;
            }

            if (hour == 12 && isAm) {
                System.out.printf("Station #% %d %02d PM \n", i + 1, hour, min);
            } else if (hour == 12 && !isAm) {
                System.out.printf("Station #%d %d %02d AM \n", i + 1, hour, min);
            } else if (isAm) {
                System.out.printf("Station #%d %d %02d AM \n", i + 1, hour, min);
            } else {
                System.out.printf("Station #%d %d %02d PM \n", i + 1, hour, min);
            }
        }
        sc.close();
    }
}
