
import java.util.Scanner;


public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("What is the capital of France?");
        System.out.println("1. Paris");
        System.out.println("2. London");
        System.out.println("3. Berlin");
        System.out.println("4. Rome");
        System.out.print("Enter your answer: ");
        if (scanner.nextInt() == 1) {
            System.out.println("Correct!");
            score++;
        }
        System.out.println("What is 2 + 2?");
        System.out.println("1. 3");
        System.out.println("2. 4");
        System.out.println("3. 5");
        System.out.println("4. 6");
        System.out.print("Enter your answer: ");
        if (scanner.nextInt() == 2) {
            System.out.println("Correct!");
            score++;
        }

        System.out.println("Your final score is " + score + " out of 2.");
    }
}


