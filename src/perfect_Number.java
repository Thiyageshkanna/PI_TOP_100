import java.util.Scanner;

public class perfect_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number to check whether it is a Perfect Number or not");
        int userInput=scn.nextInt();
        int sum=0;
        for(int i=1;i<userInput;i++){
            if(userInput%i==0){
                sum+=i;
            }
        }
        if(userInput==sum){
            System.out.println("The Given Number is a Perfect Number");
        }
        else{
            System.out.println("The Given Number is not a Perfect Number");
        }
    }
}
