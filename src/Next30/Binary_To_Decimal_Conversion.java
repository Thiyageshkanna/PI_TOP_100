//Enter a binary number : 111001
//Decimal number : 57

package Next30;

import java.util.Scanner;

public class Binary_To_Decimal_Conversion {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the binary value to convert into Decimal Value");
        int num=scn.nextInt();
//        how many times to the power of 2
        int numPower=0;
        int decimalValue=0;
        while(num>0){
            int lastDigit=num%10;
            decimalValue+=lastDigit*Math.pow(2,numPower);
            num/=10;
            numPower++;
        }
        System.out.println("The converted binary to decimal Value is "+decimalValue);



    }
}
