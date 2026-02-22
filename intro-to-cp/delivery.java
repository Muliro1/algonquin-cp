import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int quantity = 10;
        int itemPrice = 190;
        double principalAmount = itemPrice * quantity;
        double costOfBorrowing;
        double deliveryTip;
        int numOfPayments = 12;
        double interestRate;
        double monthlyPayment;
        double itemWeight = 0.32;
        long student_number;
        String upc = "725125971843";
        String itemColour = "Rose Gold";
        String studentName;
        String brandName = "Michael Kors";
        String ageRange = " adult";
        String asin = "BO1MSIVRJM";
        System.out.println("Welcome to Bob\'s store\nplease enter how much you will tip your hard working driver:");
        deliveryTip = scnr.nextInt();
        if (deliveryTip < 0){
            System.out.println("You cannot enter a negative tip amount");
        }
        int deliveryCost = 50;
        double totalWithTip = principalAmount + deliveryTip;
        double totalWithTipAndFee = totalWithTip + deliveryCost;
        System.out.println("Order details\n-----------------------------------------------------------------");
        System.out.println("item_name: " + brandName + " " + asin + " " + upc + ageRange + " Sunglasses\n" + 
                            "weight: " + itemWeight + "kgs" + "\n" +
                            "colour: " + itemColour + "\n" +
                            "Price: " + "$" + itemPrice + "\n" +
                            "quantity: " + quantity + "\n" +
                            "delivery tip: " + "$" + deliveryTip + "\n" +
                            "delivery cost: " + "$" + deliveryCost + "\n" +
                            "total: " + totalWithTipAndFee);
        System.out.println("You have opted for 12 monthly payments, please enter annual interest rate");
        interestRate = scnr.nextInt();
        if (interestRate < 0 || interestRate > 100){
            System.out.println("You have entered an invalid interest rate");
            return;
        }
        double monthlyInterestRate = (interestRate / 100) / 12;
        double factor = Math.pow(1 + monthlyInterestRate, numOfPayments);
        if (interestRate == 0) {
            monthlyPayment = principalAmount / numOfPayments;
      } else {
            monthlyPayment = principalAmount * (monthlyInterestRate * factor) / (factor - 1);
      }
        costOfBorrowing = (monthlyPayment * numOfPayments) - principalAmount;
        System.out.printf("Monthly payments: %.2f cost of borrowing: %.2f%n", monthlyPayment, costOfBorrowing);
        scnr.close();
    }
}
