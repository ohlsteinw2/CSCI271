package Assignment3;
import java.util.Scanner;
import java.util.ArrayList;

public class Question6 {
    public static void main(String[] args){
        ArrayList<Integer> storeInt = new ArrayList<Integer>();
        System.out.println("Enter a number");
        Scanner scanner = new Scanner (System.in);
        int inputNum = scanner.nextInt();
        System.out.println("Sum of numberes is " + sumEven(inputNum));
    }
    public static int sumEven(int inputNum){
        if (inputNum <= 1){
            return 1;
        }
        return inputNum + sumEven(inputNum - 1);
    }
}
