import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.next();
        String reverseStr = "";
    
        int strLength = str.length();
    
        for (int i = (strLength - 1); i >=0; --i) {
          reverseStr = reverseStr + str.charAt(i);
        }
    
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
          System.out.println(str + " is a Palindrome String.");
        }
        else {
          System.out.println(str + " is not a Palindrome String.");
        }
    }
}
