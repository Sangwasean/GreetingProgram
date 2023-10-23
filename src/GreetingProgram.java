import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's input as a String
        String name = scanner.nextLine();

        // Display a greeting
        System.out.println("Hello, " + name + "!");

        // Close the scanner to free up resources
        scanner.close();
    }
}
