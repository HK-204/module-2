import java.util.Scanner;
import java.util.function.Function;

public class InputUtils {
    private static final Scanner sc = new Scanner(System.in);

    public static <T> T inputNumber(String prompt, Function<String, T> parser) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();

            try {
                return parser.apply(input);
            } catch (Exception e) {
                System.err.println("Invalid input");
            }
        }
    }
}
