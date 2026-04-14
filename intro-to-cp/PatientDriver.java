import java.util.Scanner;

/**
 * Simple driver for the Patient class.
 *
 * Demonstrates:
 * - creating a Patient using the no-arg constructor
 * - reading name and ward from the user
 * - using setters and getters
 */
public class PatientDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Create a Patient using default constructor
        Patient patient = new Patient();

        // Show default values
        System.out.println("Default patient values:");
        System.out.println("Name: " + patient.getName());
        System.out.println("Ward: " + patient.getWard());
        System.out.println();

        // Read patient information from user
        System.out.print("Enter patient name: ");
        String name = scnr.nextLine();
        System.out.print("Enter ward number (integer): ");
        while (!scnr.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer for ward: ");
            scnr.next(); // discard invalid token
        }
        int ward = scnr.nextInt();

        // Set the values on the patient object
        patient.setName(name);
        patient.setWard(ward);

        // Display the patient information using getters
        System.out.println();
        System.out.println("Patient record:");
        System.out.println("Name: " + patient.getName());
        System.out.println("Ward: " + patient.getWard());

        scnr.close();
    }
}
