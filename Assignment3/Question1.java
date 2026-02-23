package Assignment3;
import java.util.Scanner;

public class Question1{
    private static int lengthofString(String S) {
        if (S.isEmpty()) { // base case
            return 0; 
        }
        else {
            return lengthofString(S.substring(1)) + 1; // recursive case
        }
    }
public static void main(String[] args){
    System.out.println("Enter a string:");
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    System.out.println("Length of string is: " + lengthofString(S));
}
}
