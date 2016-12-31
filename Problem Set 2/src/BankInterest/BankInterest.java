package BankInterest;

import java.util.Scanner;

public class BankInterest {

    public static void main(String[] args) {
        int num = 1;
        while (num == 1) {	// this while loop makes it so my program can keep rerunning
            Scanner keyboard = new Scanner(System.in);
            int years = 1;
            System.out.print("Please enter a starting amount for the bank account: $");
            double bankAccount = keyboard.nextDouble();
            if (bankAccount >= 0) {	// if the account number enter is greater than or equal to zero this if will run
                System.out.println("Now enter an interest rate to be used: ");
                double interest = keyboard.nextDouble();
                double annually = ((bankAccount * interest) + bankAccount);
                double monthly = ((bankAccount * (interest / 12)) + bankAccount);
                double daily = ((bankAccount * (interest / 365)) + bankAccount);
                System.out.println("The account balance daily is: $" + daily
                        + "\nThe account balance after a month is: $" + monthly
                        + "\nThe account balance after a year is: $" + annually);
                while (years <= 9) {	//
                    years++;
                    double everyYear = ((bankAccount * interest) * years) + bankAccount;
                    System.out.println("The account balance for " + years + " years is: $" + everyYear);
                }
            } else {
                System.out.print("##ERROR## !!PLEASE RERUN PROGRAM!!");
                System.exit(0);
            }
        }
    }
}		// if anything but a positive number is entered the program terminates
