import java.util.Scanner;

public class RecursiveFabonaci {

    public static int fabonaci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;}else {
            return fabonaci(n-1)+fabonaci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter a  Number : ");
        int num=input.nextInt();

        int result=fabonaci(num);
        System.out.println("The"+num+"th fabonaci number is :"+result);
    }
}
