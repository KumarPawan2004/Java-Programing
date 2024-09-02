import java.util.HashSet;
import java.util.Scanner;

public class DetectDublicate {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (input will stop when a duplicate is detected):");

        while (true) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();


            if (numbers.contains(number)) {
                 System.out.println("Duplicate number detected: " + number);
                break;
            } else {

                numbers.add(number);
            }
        }


        scanner.close();
    }
}
