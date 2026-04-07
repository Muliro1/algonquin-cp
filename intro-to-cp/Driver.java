import java.util.Scanner;
import Meat.Meat;

public class Driver {
    public static void main(String[] args) {
        String meatType;
        double weight;
        int pricePerKg;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program created by Michael Muliro.");
        System.out.print("Enter meat type: ");
        meatType = scanner.nextLine();

        System.out.print("Enter weight (in kg): ");
        weight = scanner.nextDouble();

        System.out.print("Enter price per kg (in whole dollars): ");
        pricePerKg = scanner.nextInt();

        Meat meat = new Meat();

        meat.setMeatType(meatType);
        meat.setWeight(weight);
        meat.setPricePerKg(pricePerKg);

        System.out.println("\nMeat details:");
        System.out.println(meat.toString());  

        scanner.close();
    }
}
