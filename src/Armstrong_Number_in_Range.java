import java.util.Scanner;

public class Armstrong_Number_in_Range {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Starting Number");
        int startNumber=scn.nextInt();
        System.out.println("Enter the Ending Number");
        int endNumber=scn.nextInt();
        int totalNumber=0;
        System.out.print("The Armstrong Numbers Are ");
        for(int i=startNumber;i<=endNumber;i++){
            int n=i;
            totalNumber=0;
            while (n>0){
                int lastNumber=n%10;
                totalNumber+=lastNumber*lastNumber*lastNumber;
                n/=10;
            }
            if(totalNumber==i){
                System.out.print(totalNumber+" ");
            }
        }
    }
}

