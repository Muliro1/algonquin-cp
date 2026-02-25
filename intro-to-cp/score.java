import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        // Scanner for reading user input
        Scanner scnr = new Scanner(System.in);

        // Prompt user for score
        System.out.println("Enter a score between 0 and 100: ");
        int score = scnr.nextInt();

        // Print result
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
        if (score < 60) {
            System.out.println("F");
        } else if (score < 70) {
            System.out.println("D");
        } else if (score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
    
}
}