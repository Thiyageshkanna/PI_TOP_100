import java.util.Scanner;

public class Sum_of_Digts_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        int sum=0;
        while(userInput>0){
            int lastDigit=userInput%10;
            sum+=lastDigit;
            userInput/=10;
        }
        System.out.println("The sum of Digits of a Number "+sum);
    }
}
