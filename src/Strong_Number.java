import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a Strong Number or Not");
        int number =scn.nextInt();
        int fac=1;
        int sum=0;
        int number2=number;
        while(number2>0){
            int lastDigit=number2%10;
            fac=1;
            for(int j=lastDigit;j>=1;j--){
                fac=fac*j;
            }
            sum+=fac;
            number2/=10;
        }
        if(number==sum){
            System.out.println("The given Number is a strong Number");
        }
        else{
            System.out.println("It is not a strong number");
        }
    }
}
