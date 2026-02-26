package Assignment3;
import java.util.Scanner;

public class Question5 {
    public static String reverseString(String S){
        if (S.isEmpty()){
            return "";
        }
        return reverseString(S.substring(1)) + S.charAt(0);

        }
        public static void main (String[] args){
    System.out.println("Enter a string to be reversed.");
    Scanner scanner = new Scanner(System.in);
    String S = (scanner.next());
    System.out.println("The reverse: " + reverseString(S));
}
    } // Time Complexity O(n)
