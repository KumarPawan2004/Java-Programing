import java.util.*;
public class SumPositiveIntegers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int num;
        boolean run = true;

        while (run) {
            System.out.println("Menu:");
            System.out.println("1. Enter integers");
            System.out.println("2. View sum of positive integers");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Enter integers and sum up positive numbers
                    while (true) {
                        System.out.print("Enter an integer (0 to stop entering): ");
                        num = scanner.nextInt();

                        if (num == 0) {
                            break;
                        }

                        if (num > 0) {
                            sum = sum +num;
                        }
                    }
                    break;
                case 2:
                    // Print the sum of positive integers
                    System.out.println("Sum of positive integers: " + sum);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Program ended.");
                    run = false;
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }

        scanner.close();

    }


}