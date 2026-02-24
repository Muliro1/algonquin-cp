import java.util.Scanner;

/*
 * highway.java
 * Simple program to classify U.S. Interstate highways.
 *
 * Behavior summary:
 * - Reads a single integer from standard input representing a highway number.
 * - If the number is a multiple of 100 (e.g. 100, 200), it is considered invalid
 *   and prints an error message.
 * - If the number is less than 100 it is a primary interstate:
 *     - even => east/west
 *     - odd  => north/south
 * - If the number is greater than 100 it is treated as an auxiliary highway.
 *   The program extracts the primary highway number that it serves and prints
 *   whether the auxiliary is oriented east/west (even) or north/south (odd).
 *
 * Notes:
 * - This file adds inline comments to document variables and branches. No
 *   functional changes were made to the logic.
 */

public class LabProgram {
  public static void main(String[] args) {
    // Scanner for reading input from STDIN
    Scanner scnr = new Scanner(System.in);

    // highwayNumber holds the integer provided by the user
    int highwayNumber;
    // primaryNumber is declared but unused in the original code; kept for
    // compatibility with the original layout. (Could be removed safely.)
    int primaryNumber;

    // Read highway number from input
    highwayNumber = scnr.nextInt();

    // If the highway number is divisible by 100, it is not considered a
    // valid interstate number (per this exercise's rules).
    if (highwayNumber % 100 == 0) {
      System.out.println(highwayNumber + " is not a valid interstate highway number.");
    }

    // Primary interstates have numbers less than 100. Even => east/west.
    else if ((highwayNumber < 100) && (highwayNumber % 2 == 0)) {
      System.out.println("I-" + highwayNumber + " is primary, going east/west.");
    }

    // Primary interstates with odd numbers go north/south.
    else if ((highwayNumber % 2 != 0) && (highwayNumber < 100)) {
      System.out.println("I-" + highwayNumber + " is primary, going north/south.");
    }

    // Auxiliary interstates are typically 3-digit numbers (>100). The
    // auxiliary serves a primary interstate which is derived from the last
    // two digits of the highway number. For example, 405 serves I-5.
    else if (highwayNumber > 100) {
      // Convert number to string to extract the last two digits
      String strNumber = String.valueOf(highwayNumber);
      // substring(1) takes all characters except the first one. For 405
      // that gives "05". The code below attempts to handle a leading
      // zero inside that substring.
      String subStringResult = strNumber.substring(1);
      int subIntResult;

      // The original code checks whether the second character of
      // subStringResult is "0" and then parses accordingly. Note: in
      // general Java code you should use .equals("0") to compare
      // String contents rather than '==', which compares references.
      // This comment points that out but the logic itself is left
      // unchanged to avoid altering the program behavior.
      if (subStringResult.substring(1, 2) == "0") {
        // If the middle digit is '0', parse only the final digit
        subIntResult = Integer.parseInt(subStringResult.substring(2));
      } else {
        // Otherwise parse the two-digit substring as the primary route
        subIntResult = Integer.parseInt(subStringResult);
      }

      // Decide orientation based on whether the primary route is even
      // (east/west) or odd (north/south).
      if (subIntResult % 2 == 0) {
        System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + subIntResult + ", going east/west.");
      } else {
        System.out.println("I-" + highwayNumber + " is auxiliary, serving " + "I-" + subIntResult + ", going north/south.");
      }
    }

    /* End of program. */
  }

}
