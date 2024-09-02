import java.util.Scanner;

public class FactorialCalculator {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter a positive Number : ");
        int num=input.nextInt();

        int result=factorial(num);
        System.out.println("The Factorial of "+ num +" is : "+result);
    }
}
