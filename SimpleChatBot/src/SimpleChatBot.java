import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> responses = new HashMap<>();

        responses.put("hello", "Hi there!");
        responses.put("how are you", "I'm doing great!");
        responses.put("what is java", "Java is an object-oriented programming language.");
        responses.put("your name", "My name is JavaBot.");

        System.out.println("Bot: Hello! Type 'bye' to exit.");

        while(true) {

            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if(input.equals("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            String response =
                    responses.getOrDefault(
                            input,
                            "Sorry, I don't understand."
                    );

            System.out.println("Bot: " + response);
        }
    }
}