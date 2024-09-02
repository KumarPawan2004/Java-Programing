//Normal Method to reverse

import java.util.Scanner;

public class ReverseAnArrayNormalMethod {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int Size =  Input.nextInt();

        System.out.print("Enter "+ Size +" elements  for  the array : ");

        int[] array = new int[Size];

        for (int i = 0; i< Size; i++){
            array[i] = Input.nextInt();
        }
        for (int i = Size-1; i>=0; i--){
            System.out.print(array[i]+ "");
        }

    }
}



