import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Generate and print the welcome message
        String welcomeMessage = String.format("Hey %s!\nWelcome to zyBooks!", firstName);
        System.out.println(welcomeMessage);

        // Close the Scanner to avoid resource leak
        scanner.close();
		
	}

}
