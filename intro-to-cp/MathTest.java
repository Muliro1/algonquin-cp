import java.util.Scanner;


public class MathTest {
    public static void main(String[] args) {
        //MathLibrary test = new MathLibrary();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scnr.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scnr.nextInt();
        System.out.println("Addition: " + MathLibrary.addnums(num1, num2));
        System.out.println("Subtraction: " + MathLibrary.subnums(num1, num2));
        System.out.println("Multiplication: " + MathLibrary.mulnums(num1, num2));
        System.out.println("Division: " + MathLibrary.divnums(num1, num2));
        scnr.close();
    }
}