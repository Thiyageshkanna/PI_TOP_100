import java.util.Scanner;

public class Sum_Of_Number_In_Given_Range {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int start=scn.nextInt();
        int end=scn.nextInt();
        int result=0;
        for(int i=start;i<=end;i++){
            result+=start;
            start++;
        }
        System.out.println("The Sum Of Number In Given Range is "+result);
    }
}
