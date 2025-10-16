import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Tank {
    double pi = 3.14159;
    int id;
    double diameter;
    double length;
    double volume;

    public Tank(int id, double diameter, double length) {
        this.id = id;
        this.diameter = diameter;
        this.length = length;
        this.volume = pi * Math.pow(diameter / 2, 2) * length;
    }
}

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTanks = sc.nextInt();
        Tank[] tanks = new Tank[numTanks];

        for (int i = 0; i < numTanks; i++) {
            int id = sc.nextInt();
            double diameter = sc.nextDouble();
            double length = sc.nextDouble();
            tanks[i] = new Tank(id, diameter, length);
        }

        Arrays.sort(tanks, Comparator.comparingDouble(t -> t.volume));

        for (Tank tank : tanks) {
            System.out.print(tank.id + " ");
        }
    }
}
