import java.util.Scanner;

public class LongestWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].length() >= words[j].length()) {
                    longestWord = words[i];

                }
            }
        }

        System.out.println(longestWord + " is the longest word with " + longestWord.length() + " characters.");
    }
}
