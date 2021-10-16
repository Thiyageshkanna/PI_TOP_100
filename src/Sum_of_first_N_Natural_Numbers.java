import java.util.Scanner;

public class Sum_of_first_N_Natural_Numbers {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int totalNumbers=scn.nextInt();
        int total=0;
        for(int i=0;i<=totalNumbers;i++){
            total+=i;
        }
        System.out.println(total);
    }
}
