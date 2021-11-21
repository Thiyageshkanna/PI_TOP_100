package Array;

import java.util.Scanner;

public class Largest_In_An_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
