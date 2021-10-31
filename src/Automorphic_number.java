import java.util.Scanner;

public class Automorphic_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number to check whether it is a Automorphic Number or not");
        int number=scn.nextInt();
        int n=number;
        String str=String.valueOf(number);
        int check=str.length();
        int reversed=0;
        int squareNumber=number*number;
        String kk="";
        while (check>0){
            int lastDigit=squareNumber%10;
            kk=lastDigit + ""+kk;
            check--;
            squareNumber/=10;
        }
        int i=Integer.parseInt(kk);
        if(n==i){
            System.out.println("The given Number is a Automorphic Number");
        }
        else{
            System.out.println("The given Number is not a Automorphic Number");
        }
    }
}
