import java.util.*;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter an integer value for m
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt(); // Read the integer value of m

        int n; // Variable to store the value of n

        // Determine the value of n based on the value of m
        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        // Display the result
        System.out.println("The value of n = " + n);

        // Close the scanner
        scanner.close();
    }
}
