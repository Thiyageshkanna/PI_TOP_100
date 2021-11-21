package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_An_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements in an array");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
        }
        int start=0;
        int end=length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
