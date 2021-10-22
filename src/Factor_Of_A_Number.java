import java.util.Scanner;

public class Factor_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to print the Factor of that number");
        int number =scn.nextInt();
        for (int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
