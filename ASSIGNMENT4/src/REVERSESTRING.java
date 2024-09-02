import java.util.*;
public class REVERSESTRING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Para ;
        String Reversed = "";
        int i;
        System.out.println("Enter the paragraph : ");
        Para = scanner.nextLine();
        for(i=Para.length() - 1;i >= 0 ;i--){
            Reversed = Reversed + Para.charAt(i);
        }
        System.out.println("Reversed String : " + Reversed);
        scanner.close();
    }
}
