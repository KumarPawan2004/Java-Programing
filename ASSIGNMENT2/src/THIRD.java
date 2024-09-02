import java.util.*;
public class THIRD {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println(number  + "  is a positive number");
        }else{
            System.out.println(number + " is a negative number");
        }
        scanner.close();

    }
}
