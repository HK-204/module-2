import java.util.Scanner;
import java.util.TreeMap;

public class wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();

        word = word.toLowerCase();

        String[] words = word.split("[\\s.,?!;:\"'()\\[\\]{}]+");

        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word1 : words) {
            if (word1.isEmpty()) continue;

            if (map.containsKey(word1)) {map.put(word1, map.get(word1) + 1);}
            else {map.put(word1, 1);}
        }

        System.out.println("Statistical results");
        for (String word1 : map.keySet()) {
            System.out.println(word1 + " : " + map.get(word1));
        }
    }
}
