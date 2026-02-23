package Assignment3;
import java.util.Scanner;

public class Question4 {
    private static int countNum(String sN, char sD){
        if (sN.isEmpty()){ // base case
            return 0;
        }
        else if (sN.charAt(0) == sD) {
            return countNum(sN.substring(1), sD) + 1;
        }
        else {
            return countNum(sN.substring(1), sD);
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner (System.in);
        long N = (scanner.nextLong());
        System.out.println("Now enter a number you would like to see how many times appears in the number.");
        String input = scanner.next();
        char sD = input.charAt(0);
        String sN = String.valueOf(N);
        System.out.println("Number: " + N);
        System.out.println(sD + " appears: " + countNum(sN, sD));

    }
}
