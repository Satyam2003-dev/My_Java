// use of do while loop

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class addnumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int runagain = 0;
        do { 
            System.out.println("Enter first number: ");
            double num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextInt();
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);
            System.out.println("Do you want to add more numbers? (1 for yes, 0 for no): ");
            runagain = scanner.nextInt();
            if (runagain == 0) {
                System.out.println("Thank you for using this program");
            }
            else if (runagain == 1) {
                System.out.println("Enter more numbers");
            }
            else {
                System.out.println("Invalid input. Exiting program.");
                runagain = 0;
            }
        } while (runagain == 1);
        scanner.close();

    }
}
