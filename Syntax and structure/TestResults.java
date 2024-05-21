import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the test score
        System.out.print("Enter the test score (0-100): ");
        int score = scanner.nextInt();

        // Validate the score
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            // Determine the letter grade based on the score
            char grade;
            if (score >= 91) {
                grade = 'A';
            } else if (score >= 81) {
                grade = 'B';
            } else if (score >= 71) {
                grade = 'C';
            } else if (score >= 61) {
                grade = 'D';
            } else if (score >= 41) {
                grade = 'E';
            } else {
                grade = 'F';
            }

            // Display the letter grade
            System.out.println("The letter grade is: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}
