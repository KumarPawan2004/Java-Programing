import java.util.*;

public class SUM_BY_NORMAL{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int sum = 0;
        int number;

        // Prompt the user for input and process it
        System.out.println("Enter positive integers to sum. Enter 0 to finish:");

        // Use a while loop to continuously prompt the user for input
        while (true) {
            // Read an integer from the user
            number = scanner.nextInt();

            // Check if the number is 0 to terminate the loop
            if (number == 0) {
                break;
            }

            // Add only positive integers to the sum
            if (number > 0) {
                sum += number;
            } else {
                System.out.println("Negative numbers are not included in the sum.");
            }
        }

        // Print the final sum
        System.out.println("The sum of the positive integers entered is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
