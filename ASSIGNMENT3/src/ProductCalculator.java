public class ProductCalculator {
    public static void main(String[] args) {
        // Initialize the product variable to 1
        int product = 1;

        // Initialize the counter variable
        int i = 1;

        // Loop from 1 to 5
        while (i <= 5) {
            // Multiply the product by the current number
            product *= i;

            // Increment the counter variable
            i++;
        }

        // Print the final product
        System.out.println("The product of numbers from 1 to 5 is: " + product);
    }
}
