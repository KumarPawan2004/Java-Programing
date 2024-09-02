import java.util.*;

public class Seventh {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their height
        System.out.print("Enter the height of the person in centimeters: ");
        int height = scanner.nextInt();

        // Categorize based on height
        if (height < 150) {
            System.out.println("The person is a Dwarf.");
        } else if (height >= 150 && height <= 165) {
            System.out.println("The person has Average height.");
        } else {
            System.out.println("The person is Tall.");
        }

        // Close the scanner
        scanner.close();
    }
}
