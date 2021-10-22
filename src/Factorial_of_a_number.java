import java.util.Scanner;

public class Factorial_of_a_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to find factorial Number");
        int number =scn.nextInt();
        int total=1;
        if(number>0){
            for(int i=1;i<=number;i++){
                total*=i;
            }
            System.out.println(total);
        }
        else{
            System.out.println("The Entered number is less than 0");
        }
    }
}
