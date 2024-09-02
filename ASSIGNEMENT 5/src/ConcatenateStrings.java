import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        String num1 = scanner.next();


        System.out.print("Enter second number: ");
        String num2 = scanner.next();


        String concatenate = num1 + num2;


        System.out.println("The concatenated result is: " + concatenate);


        scanner.close();
    }
}
