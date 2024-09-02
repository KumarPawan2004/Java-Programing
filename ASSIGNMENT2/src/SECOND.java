import java.util.* ;
public class SECOND {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer:");
        int number = scanner.nextInt();

        if( number % 2 == 0){
            System.out.println(number  + "  is an even integer");
        }else{
            System.out.println(number   + " is an odd integer");
        }

        scanner.close();

    }
}
