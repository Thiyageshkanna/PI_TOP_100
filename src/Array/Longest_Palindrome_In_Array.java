package Array;

import java.util.Scanner;

public class Longest_Palindrome_In_Array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int length=scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements in the Array ");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
        }
        int ans=longestPalindrome(arr,length);
        System.out.println(ans);
    }

    private static int longestPalindrome(int[] arr, int length) {
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=length-1;i<length;i++){
            if (isPalindrome(arr[i])) {
                return arr[i];
            }

        }
        return -1;
    }

    private static boolean isPalindrome(int i) {
        int temp=i;
        int sum=0;
        while(i>0){
            int lastDigit=i%10;
            sum=(sum*10)+lastDigit;
            i/=10;
        }
        return temp == sum;
    }
}

