import java.util.*;

public class FOURTH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;  // The year is divisible by 400, so it's a leap year
                } else {
                    return false; // The year is divisible by 100 but not by 400, so it's not a leap year
                }
            } else {
                return true;  // The year is divisible by 4 but not by 100, so it's a leap year
            }
        } else {
            return false; // The year is not divisible by 4, so it's not a leap year
        }
    }
}
