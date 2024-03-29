import java.util.Scanner;

public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int f = sc.nextInt();
        int[][][] hotel = new int[f][r][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    hotel[i][j][k] = sc.nextInt();
                }
            }
        }
        int n = sc.nextInt();
        for (int a = 0; a < n; a++) {
            int amountPeople = sc.nextInt();
            int roomNumberCount = 0;
            int minI = -1;
            int minJ = -1;
            int minK = -1;
            int minRoomNumber = 0;
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < c; k++) {
                        roomNumberCount++;
                        if ((hotel[i][j][k] >= amountPeople)
                                && (minI == -1 || hotel[i][j][k] < hotel[minI][minJ][minK])) {
                            minI = i;
                            minJ = j;
                            minK = k;
                            minRoomNumber = roomNumberCount;
                        }
                    }
                }
            }
            if (minRoomNumber == 0) {
                System.out.println(amountPeople + " -> ROOM NOT FOUND");
                continue;
            }
            System.out.println(amountPeople + " -> #" + minRoomNumber);
            hotel[minI][minJ][minK] = 0;
        }
        sc.close();
    }
}