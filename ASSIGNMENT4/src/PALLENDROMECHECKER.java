import java.util.Scanner;

public class PALLENDROMECHECKER{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        // Call the method to check for palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {

        String LowwerAndReplace= str.toLowerCase().replaceAll("\\s+", "");


        String reversedStr = new StringBuilder(LowwerAndReplace).reverse().toString();


        return LowwerAndReplace.equals(reversedStr);
    }
}
