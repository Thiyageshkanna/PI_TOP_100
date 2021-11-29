//output
//Elements are not of original array
//11
//22
//33
//11
//22
//44
//55
//55
//11 occurs 2 times
//22 occurs 2 times
//33 occurs 1 times
//44 occurs 1 times
//55 occurs 2 times

package Array;

import java.util.Scanner;

public class Frequency_of_Elements_In_an_array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length=scn.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the elements in an array : ");
        for(int i=0;i<length;i++){
            arr[i]=scn.nextInt();
        }
        int[] visit=new int[length];
        int visited=-1;
        for(int i=0;i<length;i++){
            int occurs=1;
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    occurs++;
                    visit[j]=visited;
                }
            }
            if(visit[i]!=visited){
                visit[i]=occurs;
            }
        }
        for(int i=0;i<length;i++){
            if(visit[i]!=visited){
                System.out.println(arr[i]+" occurs "+visit[i]+" Times.");
            }
        }

    }
}












