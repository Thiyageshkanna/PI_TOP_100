import java.util.Scanner;

public class Abundant_Number_Or_Not {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number to check whether it is a Abundant Number or not");
        int number=scn.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }

        if(sum>number){
            System.out.println("The given Number is an Abundant Number");
        }
        else{
            System.out.println("The given Number is not an Abundant Number");
        }
    }
}
