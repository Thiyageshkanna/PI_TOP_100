import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int start=scn.nextInt();
        int end=scn.nextInt();
        int totalSum=0;
        for(int i= start;i<=end;i++){
            int check=i;
            while (check>0){
                int lastDigit=check%10;
                totalSum+=lastDigit*lastDigit*lastDigit;
                check/=10;
            }
            if(totalSum==i){
                System.out.print(i+" ");
            }
        }

    }
}
