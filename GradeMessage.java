import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        // Prompt the user to enter their letter grade
        System.out.println("Enter your letter grade:");
        
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        
        // Close the scanner
        scanner.close();

        // Declare a variable to store the message
        String message;

        // Determine the message based on the letter grade using switch statement
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        // Display the message
        System.out.println(message);
    }
}
