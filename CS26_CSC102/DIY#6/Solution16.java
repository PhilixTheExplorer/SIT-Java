import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        int R = sc.nextInt();
        int Z = sc.nextInt();
        int[][][] lights = new int[F][R][Z];

        for (int f = 0; f < F; f++) {
            for (int r = 0; r < R; r++) {
                for (int z = 0; z < Z; z++) {
                    lights[f][r][z] = sc.nextInt();
                }
            }
        }

        int floorToTurnOff = sc.nextInt() - 1; // Convert to 0-based index

        // Turn off all lights on the specified floor
        if (floorToTurnOff >= 0 && floorToTurnOff < F) {
            for (int r = 0; r < R; r++) {
                for (int z = 0; z < Z; z++) {
                    lights[floorToTurnOff][r][z] = 0;
                }
            }
        }

        // Count total lights still on
        int totalLightsOn = 0;
        for (int f = 0; f < F; f++) {
            for (int r = 0; r < R; r++) {
                for (int z = 0; z < Z; z++) {
                    if (lights[f][r][z] == 1) {
                        totalLightsOn++;
                    }
                }
            }
        }

        for (int f = 0; f < F; f++) {
            for (int r = 0; r < R; r++) {
                for (int z = 0; z < Z; z++) {
                    System.out.print(lights[f][r][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Lights On: " + totalLightsOn);

        sc.close();
    }
}