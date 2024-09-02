import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n){
        if(n==0){
            return 0;
        }else {
            return (n % 10) + sum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter a  Number : ");
        int num=input.nextInt();

        int result=sum(num);
        System.out.println("The sum of "+ num +" is : "+result);
    }
}
