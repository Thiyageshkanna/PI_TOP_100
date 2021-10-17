import java.util.Scanner;

public class Reverse_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int userInput=scn.nextInt();
        int reversed=0;
        while(userInput>0){
            int lastDigit=userInput%10;
            reversed=(reversed*10)+lastDigit;
            userInput/=10;
        }
        System.out.println(reversed);
    }
}
