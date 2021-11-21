package Array;

import java.util.Scanner;

public class Sum_Of_An_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Length of The array ");
        int length=scn.nextInt();
        int sum=0;
        int[] arr=new int[length];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
