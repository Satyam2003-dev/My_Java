// package games;

import java.util.Scanner;

public class ChangeForARupees {

    public static void main(String[] args){

        double Paisa = .01;
        double Chauanni = .25;
        double Athanni = .5;
        int Rupees = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Rupees'! " +
                "Your goal is to enter enough change to make exactly ₹1.00");

        System.out.println("Enter your number of Paisa:");
        int numOfPaisa = scanner.nextInt();

        System.out.println("Enter your number of Chaunni:");
        int numOfChauanni = scanner.nextInt();

        System.out.println("Enter your number of Athanni:");
        int numOfAthanni = scanner.nextInt();

        scanner.close();

        double total = numOfPaisa * Paisa + numOfChauanni * Chauanni + numOfAthanni * Athanni;

        if(total < Rupees){
            double amountShort = Rupees - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " paisa.");
        }
        else if(total > Rupees){
            double amountOver = total - Rupees;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " paisa.");
        }
        else{
            System.out.println("Yay! That's exactly ₹1.00! You win!");
        }
    }
}
