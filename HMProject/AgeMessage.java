
import java.util.Scanner;

public class AgeMessage {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check the age and print a message accordingly
        if (age < 0) {
            System.out.println("Invalid age! Please enter a valid age.");
        } else if (age < 18) {
            System.out.println("Hey there! You're under 18 years old.");
        } else if (age < 65) {
            System.out.println("Hello! You're between 18 and 64 years old.");
        } else {
            System.out.println("Greetings! You're 65 years old or older.");
        }

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}
