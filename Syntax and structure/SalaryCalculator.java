import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown sales
        Scanner scanner = new Scanner(System.in);

        // Get sales
        System.out.println("How many sales did you make this week?");
        int sales = scanner.nextInt();

        // Check if quota is achieved and add bonus to salary
        if (sales >= quota) {
            salary += bonus;
            System.out.println("Congrats! You've met the sales quota and earned a bonus.");
        } else {
            System.out.println("You did not meet the sales quota. No bonus added to salary.");
        }

        // Output salary
        System.out.println("Your pay for this week is $" + salary);

        // Close the scanner
        scanner.close();
    }
}
