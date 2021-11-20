package Next30;

//Enter the first number : 15
//
//Enter the second number : 35
//
//HCF is = 5
//
//
//Enter the first number : 12
//
//Enter the second number : 12
//
//HCF is = 12


import java.util.Scanner;

public class Highest_Common_Factor {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the two Number to check hcf of that");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int min=Math.min(num1,num2);
        boolean hcfValue=false;
        int hcf=0;
        for(int i=2;i<=min;i++){
            if(num1%i==0 && num2%i==0 ){
                hcf=i;
                hcfValue=true;
                break;
            }
        }
        if(hcfValue){
            System.out.println("The HCF of given two number is "+ hcf);
        }
        else{
            System.out.println("The given two number doesn't have HCF value");
        }

    }
}
