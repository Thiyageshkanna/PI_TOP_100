import java.util.Scanner;

public class Print_Prime_Number_With_Given_Range {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int start=scn.nextInt();
        int end=scn.nextInt();
        int count;
        for(int i=start;i<=end;i++){
//            Here adding count 0 because to make it count as 0 and to replace the previous value which is looped
            count=0;

            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
