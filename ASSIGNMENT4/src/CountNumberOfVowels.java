import java.util.Scanner;

public class CountNumberOfVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine().toUpperCase();


        int vowelCount = 0;
        int consonantCount = 0;



        for (int i = 0; i < input.length()-1; i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Output the result
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}
