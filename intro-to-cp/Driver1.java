import java.util.Scanner;

/*
 * delivery.java
 * Example program that computes order totals and monthly loan payments for a
 * simple purchase. This file adds inline documentation explaining each step.
 * No functional changes were made to the calculations; only comments were
 * inserted to make the intent clearer.
 */

public class Driver1 {
    public static void main(String[] args) {
        // Scanner to read user input (tip amount and interest rate)
        Scanner scnr = new Scanner(System.in);

        // Order information (hard-coded for this example)
        int quantity = 10;            // number of items purchased
        int itemPrice = 190;         // price per item (in dollars)

        // Principal amount to be financed (price * quantity)
        double principalAmount = itemPrice * quantity;

        // Variables used later for borrowing cost and payments
        double costOfBorrowing;
        double deliveryTip;
        int numOfPayments = 12;      // number of monthly payments
        double interestRate;         // annual interest rate (percent)
        double monthlyPayment;

        // Item metadata (not used in calculations, printed in the receipt)
        double itemWeight = 0.32;    // weight in kilograms
        long student_number;         // declared but unused (placeholder)
        String upc = "725125971843";
        String itemColour = "Rose Gold";
        String studentName;          // declared but unused
        String brandName = "Michael Kors";
        String ageRange = " adult";
        String asin = "BO1MSIVRJM";

        // Prompt user for delivery tip and read it
        System.out.println("Welcome to Bob\'s store\nplease enter how much you will tip your hard working driver:");
        deliveryTip = scnr.nextInt();

        // Basic validation: tip should not be negative
        if (deliveryTip < 0) {
            System.out.println("You cannot enter a negative tip amount");
        }

        // Flat delivery fee used in the receipt calculation
        int deliveryCost = 50;

        // Totals include tip and delivery fee
        double totalWithTip = principalAmount + deliveryTip;
        double totalWithTipAndFee = totalWithTip + deliveryCost;

        // Print a simple receipt showing what was ordered and totals
        System.out.println("Order details\n-----------------------------------------------------------------");
        System.out.println("item_name: " + brandName + " " + asin + " " + upc + ageRange + " Sunglasses\n" + 
                            "weight: " + itemWeight + "kgs" + "\n" +
                            "colour: " + itemColour + "\n" +
                            "Price: " + "$" + itemPrice + "\n" +
                            "quantity: " + quantity + "\n" +
                            "delivery tip: " + "$" + deliveryTip + "\n" +
                            "delivery cost: " + "$" + deliveryCost + "\n" +
                            "total: " + totalWithTipAndFee);

        // Ask the user for an annual interest rate to compute monthly payments
        System.out.println("You have opted for 12 monthly payments, please enter annual interest rate");
        interestRate = scnr.nextInt();

        // Validate interest rate input
        if (interestRate < 0 || interestRate > 100) {
            System.out.println("You have entered an invalid interest rate");
            return; // stop program due to invalid input
        }

        // Convert annual percentage rate into a monthly decimal rate
        double monthlyInterestRate = (interestRate / 100) / 12;

        // Compute factor used in the standard annuity formula
        double factor = Math.pow(1 + monthlyInterestRate, numOfPayments);

        // If interest rate is zero, monthly payment is just principal / months
        if (interestRate == 0) {
            monthlyPayment = principalAmount / numOfPayments;
        } else {
            // Standard formula for fixed monthly payment on an installment loan
            monthlyPayment = principalAmount * (monthlyInterestRate * factor) / (factor - 1);
        }

        // Total cost of borrowing is total of payments minus principal
        costOfBorrowing = (monthlyPayment * numOfPayments) - principalAmount;

        // Print results: monthly payment and total cost of borrowing (formatted)
        System.out.printf("Monthly payments: %.2f cost of borrowing: %.2f%n", monthlyPayment, costOfBorrowing);

        // Close scanner to free resources
        scnr.close();
    }
}

