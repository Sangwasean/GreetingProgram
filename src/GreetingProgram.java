import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.print("How old are you: ");

        int age = scanner.nextInt();

        System.out.print("What is your nationality:");
        scanner.nextLine();

        String home = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You are from " + home + ".");
        scanner.close();
    }
}
