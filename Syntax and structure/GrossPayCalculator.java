// package gross_calculator; // This is the package declaration uncomment if you need this

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        //1. Get the number of hours worked
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        if(scanner.hasNextInt()) {
            hours = scanner.nextInt();
        } else {
            System.out.println("Invalid input for hours. Please enter an integer.");
            return;
        }

        //2. Get the hourly pay rate
        System.out.println("What is your pay rate?");
        double payRate = 0;
        if(scanner.hasNextDouble()) {
            payRate = scanner.nextDouble();
        } else {
            System.out.println("Invalid input for pay rate. Please enter a double.");
            return;
        }

        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay);
    }
}
