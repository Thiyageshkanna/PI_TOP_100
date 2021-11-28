package Array;
//Enter the length of the array :
//7
//Enter the element of the array :
//4 5 2 3 1 6 7
//Sorted array
//1 2 3 7 6 5 4

import java.util.Arrays;
import java.util.Scanner;

public class Sort_First_half_in_ascending_and_second_half_in_descending {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements in an array");
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
       for(int i=0;i<length/2;i++){
           System.out.print(arr[i]+" ");
       }
       for(int i=length-1;i>=length/2;i--){
           System.out.print(arr[i]+" ");
       }
    }
}
