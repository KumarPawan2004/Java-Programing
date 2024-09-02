import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int Size =  Input.nextInt();

        System.out.print("Enter "+ Size +" elements  for  the array : ");

        int[] array = new int[Size];

        for (int i = 0; i< Size; i++){
            array[i] = Input.nextInt();
        }
        int max = array[0];
        for (int i = 0; i< Size; i++){
            if(array[i] > max){
               max = array[i];
            }
        }
        System.out.print(" The largest element in the array is : " + max);




    }
}
