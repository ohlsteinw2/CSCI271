import java.util.Scanner;
// Had trouble getting "finalExam" i originally had it named as final in my c++ program
// but final is a reserved keyword in java i learned that by using chatgpt but thats all i used for help
public class Calculate {

    private static char letterGrade(double grade){
        if (grade < 60) return 'F';
        else if (grade < 70) return 'D';
        else if (grade < 80) return 'C';
        else if (grade < 90) return 'B';
        else return 'A';
    }

    public static void main(String[] args) {
        double finalExam = 0.0, midterm = 0.0, assignments = 0.0, tests = 0.0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 7 assignment grades:");
        for (int i = 0; i < 7; i++){
            assignments += input.nextDouble();
        }
        assignments /= 7;

        System.out.println("Enter 7 test grades:");
        for (int i = 0; i < 7; i++){
            tests += input.nextDouble();
        }
        tests /= 7;

        System.out.print("Enter your midterm grade: ");
        midterm = input.nextDouble();

        System.out.print("Enter your final exam grade: ");
        finalExam = input.nextDouble();

        double E = (finalExam * 0.4 + midterm * 0.2 + tests * 0.1) / 0.7;
        double grade;

        if (E < 60) {
            grade = E;
        } else if (E < 80) {
            double W = ((E - 60) / 20) * 0.3;
            grade = (1 - W) * E + W * assignments;
        } else {
            grade = finalExam * 0.4 + midterm * 0.2 + tests * 0.1 + assignments * 0.3;
        }

        System.out.println("Your final grade is: " + grade);
        System.out.println("Your letter grade is: " + letterGrade(grade));

        input.close();
    }
}
