package Assignment3;
import java.util.Scanner;

public class Question2 {
    private static int countChar(String S, char C) {
        if (S.isEmpty()) { // base case
            return 0;
        }
        else if (S.charAt(0) == C){
            return countChar(S.substring(1), C) + 1; // recursive call
        }
        else {
            return countChar(S.substring(1), C); 
        }
    }
    public static void main(String[] args) {
    System.out.println("Enter a string:");
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    System.out.println("How many of which character?");
    char C = scanner.nextLine().charAt(0);
    System.out.println("Count of '" + C + "' is: " + countChar(S, C));
    }
}
