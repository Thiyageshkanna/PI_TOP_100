package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Smallest_In_An_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the array elements to find the second smallest in an array");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[1]);

    }
}
