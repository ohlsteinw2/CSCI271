package Assignment3
import java.util.Scanner;
public class Question4 {

    public static int countDigit(long N, int D) {
        
        if (N == 0) { // base case
            return 0;
        }

        // Check last digit
        if (N % 10 == D) {
            return 1 + countDigit(N / 10, D); // recursive call
        } else {
            return countDigit(N / 10, D);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        long N = scanner.nextLong();

        System.out.println("Enter a single digit: ");
        int D = scanner.nextInt();

        int result = countDigit(N, D);

        System.out.println("Digit " + D + " appears " + result + " times.");
    }
}
