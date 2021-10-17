import java.util.Scanner;

public class palindrome_or_not {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String userInput1=scn.nextLine();
        String userInput=userInput1.toLowerCase();
        int start=0;
        int end=userInput.length()-1;
        boolean isPalindrome=true;
        while(start<end){
            if(userInput.charAt(start)!=userInput.charAt(end)){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("The given Number or String is Palindrome");
        }
        else{
            System.out.println("The given Number or String is not a Palindrome");
        }
    }
}
