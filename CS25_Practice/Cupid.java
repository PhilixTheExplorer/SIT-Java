import java.util.*;

public class Cupid {
    static class Person {
        String name;
        List<String> interests = new ArrayList<>();
        List<String> refuseList = new ArrayList<>();

        Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            Person person = new Person(name);

            // Refuse list
            String refusesLine = sc.nextLine();
            String[] refuses = refusesLine.split(" ");
            for (String s : refuses) {
                if (!s.equals("-1")) {
                    person.refuseList.add(s);
                }
            }

            // Interests
            String interestsLine = sc.nextLine();
            String[] interests = interestsLine.split(" ");
            for (String s : interests) {
                if (!s.equals("-1")) {
                    person.interests.add(s);
                }
            }

            people.add(person);
        }

        // Match results
        String[] result = new String[n];
        Arrays.fill(result, "Forever Alone");

        for (int i = 0; i < n; i++) {
            Person p1 = people.get(i);

            int maxCommon = -1;
            int bestMatchIndex = -1;
            String bestMatchName = "";

            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;

                Person p2 = people.get(j);

                if (p1.refuseList.contains(p2.name) || p2.refuseList.contains(p1.name))
                    continue;

                // Compute common interests
                List<String> common = new ArrayList<>(p1.interests);
                common.retainAll(p2.interests);
                int commonCount = common.size();

                if (commonCount > maxCommon ||
                        (commonCount == maxCommon && p2.name.compareTo(bestMatchName) < 0)) {
                    maxCommon = commonCount;
                    bestMatchIndex = j;
                    bestMatchName = p2.name;
                }
                System.out.println(bestMatchName);
            }

            if (bestMatchIndex != -1) {
                Person p2 = people.get(bestMatchIndex);
                result[i] = p2.name;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(people.get(i).name + " " + result[i]);
        }
    }
}
