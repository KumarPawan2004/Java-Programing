import java.util.*;

public class FIFTH{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int Age = scanner.nextInt();

        if (CheckAge(Age)) {
            System.out.println("Congratulation! You are eligible for casting your vote.");
        } else {
            System.out.println( "Congratulation! You are not eligible for casting your vote.");
        }
        scanner.close();
    }

    public static boolean CheckAge(int Age) {
        if (Age > 18) {
            return true;
        } else {
            return false; // The year is not divisible by 4, so it's not a leap year
        }
    }
}
