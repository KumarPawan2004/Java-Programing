import java.util.Scanner;

public class Cubessum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //set limit
        System.out.print("Enter the limit up to which to calculate the sum of cubes of even numbers: ");
        int limit = scanner.nextInt();

        //only for even number
        int currentNumber = 2;

        //for sum
        int sumOfCubes = 0;


        while (currentNumber <= limit) {
            //claulate cube
            int cube = currentNumber * currentNumber * currentNumber;
            //addition of cube
            sumOfCubes = sumOfCubes + cube;
            //  increment
            currentNumber = currentNumber + 2;
        }

            //print
        System.out.println("The sum of the cubes of even numbers up to " + limit + " is " + sumOfCubes);


        scanner.close();
    }
}
