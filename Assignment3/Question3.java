package Assignment3;
import java.util.Scanner;
import java.util.Arrays;

public class Question3 {

    public static void main (String[] args) {
        int[] A = new int[10];
        System.out.println("Enter ints to put into the array.");
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (scanner.hasNextInt() && n < A.length) {
            A[n] = scanner.nextInt();
            n++;
        }

        System.out.println("List of array " + Arrays.toString(A));

        if (n > 0) {
            System.out.println("Max = " + max(A, n));
        } else {
            System.out.println("No numbers entered.");
        }
    }

    public static int max(int[] A, int n) {
        if (n == 1) {          // base case: max of first 1 element
            return A[0];
        }

        int prevMax = max(A, n - 1);  // recursive call
        return (A[n - 1] > prevMax) ? A[n - 1] : prevMax;
    }
} // Time Complexity O(n)
