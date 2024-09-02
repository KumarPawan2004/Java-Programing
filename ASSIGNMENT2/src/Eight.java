import java.util.Scanner;

public class Eight{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Display the numbers entered
        System.out.println("1st Number = " + num1);
        System.out.println("2nd Number = " + num2);

        // Find the largest number using the ternary operator
        int largest = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);

        // Display the largest number
        if (largest == num1) {
            System.out.println("The 1st Number is the greatest among the three");
            System.out.println("1st Number = " + num1);
        } else if (largest == num2) {
            System.out.println("The 2nd Number is the greatest among the three");
            System.out.println("2nd Number = " + num2);
        } else {
            System.out.println("The 3rd Number is the greatest among the three");
            System.out.println("3rd Number = " + num3);
        }

        // Close the scanner
        scanner.close();
    }
}
