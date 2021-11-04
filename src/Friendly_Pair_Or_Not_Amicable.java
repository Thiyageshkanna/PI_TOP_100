import java.util.Scanner;

public class Friendly_Pair_Or_Not_Amicable {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two Numbers to check Whether it is a Friendly Number or Not");
        int number1=scn.nextInt();
        int number2=scn.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<number1;i++){
            if(number1%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<number2;i++){
            if (number2 % i == 0) {

                sum2+=i;
            }
        }
        System.out.println(sum1 +" " +sum2);
        if(sum1==number2 && sum2==number1){
            System.out.println("The Given Two Numbers Are Friendly pair");
        }
        else{
            System.out.println("The Given Two Numbers Are not Friendly Pair");
        }
    }
}
