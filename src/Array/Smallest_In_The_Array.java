package Array;

import java.util.Scanner;

public class Smallest_In_The_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int length= scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements in the array to store");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}
