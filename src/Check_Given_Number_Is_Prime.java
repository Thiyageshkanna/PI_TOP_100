import java.util.Scanner;

public class Check_Given_Number_Is_Prime {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        boolean isPrime=true;
        int userInput=scn.nextInt();
        if(userInput==0 || userInput==1){
            System.out.println("Either a Prime Number nor a Prime Number");
        }
        for(int i=2;i<=userInput/2;i++){
            if(userInput%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The given Number is a Prime Number");
        }
        else{
            System.out.println("The given number is not a prime Number");
        }
    }
}
