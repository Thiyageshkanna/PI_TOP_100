import java.util.Scanner;

public class Fibonacii_series_upto_n {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number =scn.nextInt();
        int start=0;
        int end=1;
        System.out.print(start+" "+end+" ");
        for(int i=2;i<=number;i++){
            int result=start+end;
            System.out.print(result + " ");
            int temp=start;
            start=end;
            end=result;
        }
    }

}
