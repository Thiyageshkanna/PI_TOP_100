import java.util.Scanner;

public class Power_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number to find power of a Number");
        int number=scn.nextInt();
        if(number>0){
            int total=number*number;
            System.out.println(total);
        }
        else{
            System.out.println("The Entered Number is Less than 0");
        }


    }
}
