import java.util.Scanner;

public class CheckPrime{


    public static boolean isPrime(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer to check if it's prime: ");
        int number = scanner.nextInt();




        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


        scanner.close();
    }
}
