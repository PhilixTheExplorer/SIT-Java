import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> courses = new HashMap<>();

        while (true) {
            String input = sc.nextLine();

            if (input.equals("end")) {
                break;
            }

            String[] parts = input.split(",");
            String course = parts[0];
            int students = Integer.parseInt(parts[1]);

            if (courses.containsKey(course)) {
                courses.put(course, courses.get(course) + students);
            } else {
                courses.put(course, students);
            }
        }

        String maxCourse = "";
        int maxStudents = 0;
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() > maxStudents) {
                maxStudents = entry.getValue();
                maxCourse = entry.getKey();
            }
        }

        System.out.println(maxCourse + "," + maxStudents);
        sc.close();
    }
}
