import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your string: ");
        String s = sc.nextLine();

        char[] listChar = s.toCharArray();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < listChar.length; i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(listChar[i]);
            for (int j = i + 1; j < listChar.length; j++) {
                if (listChar[j] > temp.getLast()) {
                    temp.add(listChar[j]);
                }
            }

            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }

        for (Character c : max) {
            System.out.print(c);
        }
    }
}