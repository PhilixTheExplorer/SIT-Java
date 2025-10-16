import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sum += sc.nextInt();
            }
            System.out.println("sum of row#" +i+" is " + sum);
            sum = 0;
        }
    }
}
