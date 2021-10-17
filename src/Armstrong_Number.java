import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number =scn.nextInt();
        int userInput=number;
        int totalSum=0;
        while(number>0){
            int lastDigit=number%10;
            totalSum+=lastDigit*lastDigit*lastDigit;
            number/=10;
        }
        if(userInput==totalSum){
            System.out.println("The given Number is Armstrong");
        }
        else{
            System.out.println("The given Number is not a Armstrong Number");
        }
    }
}
