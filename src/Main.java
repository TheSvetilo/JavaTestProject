import java.util.Objects;
import java.util.Scanner;

public class Main {

    private final static String[] ACTIONS = {
            "help",
            "start",
            "end",
            "weather",
            "mood"
    };

    private final static String[] RESULTS = {
            "",
            "Bot has been started",
            "Bot has been closed",
            "It's cold outside",
            "Don't worry, be happy!"
    };

    public static void main(String[] arg) {

        System.out.println("Welcome to the Bot!");

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean found;

        RESULTS[0] = getActions(ACTIONS);

        while (true) {
            input = scanner.nextLine();
            found = false;

            for (int i = 0; i < ACTIONS.length; i++) {
                if (Objects.equals(input, ACTIONS[i])) {
                    System.out.println(RESULTS[i]);
                    found = true;
                    break;
                }
            }

            if (Objects.equals(input, ACTIONS[2])) break;

            if (!found) {
                System.out.println("Please type 'help' to find useful commands.");
            }
        }
    }

    private static String getActions(String[] array) {

        StringBuilder result = new StringBuilder();
        result.append("The following commands are available: \n");

        for (String item : array) {
            result.append(" /").append(item).append("\n");
        }

        return result.toString();
    }
}
