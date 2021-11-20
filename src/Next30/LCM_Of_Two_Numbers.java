//Enter the first number : 5
//Enter the second number : 8
//LCM of 5 and 8 is : 40

package Next30;
import java.util.Scanner;

public class LCM_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to find the LCM value");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int max=Math.max(num1,num2);
        int multiply=num1*num2;
        int lcm=0;
        boolean isLcm=false;
        for(int i=max;i<=multiply;i++){
            if(i%num1==0 && i%num2==0){
                lcm=i;
                isLcm=true;
                break;
            }
        }
        if(isLcm){
            System.out.println("The LCM of given two number is "+lcm);
        }
        else{
            System.out.println("The given two Number Doesn't have lcm value");
        }
    }
}
