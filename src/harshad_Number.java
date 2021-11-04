import java.util.Scanner;

public class harshad_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a harshad Number or not");
        int number =scn.nextInt();
        int n=number;
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        System.out.println("Added Numbers "+sum);
        if(number%sum==0){
            System.out.println("The Given Number is a Harshad Number "+number);
        }
        else
            System.out.println("The Given Number is not a Harshad Number");
    }
}
