import java.util.Scanner;

public class Fibonacii_series_upto_n {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number =scn.nextInt();
        int start=0;
        int end=1;
        int result=0;
        if(number>0){
            System.out.print(start+" "+end+" ");
            while(number>result){
                result=start+end;
                if (number>=result){
                    System.out.print(result+" ");
                }
                int temp=start;
                start=end;
                end=result;
            }
        }
    }

}
