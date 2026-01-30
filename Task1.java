
import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);
    static final int MAX_ATTEMPTS = 5;
    static final int MAX_ROUNDS = 3;
    static final int MAX_RAND_NUMBER = 100;

    public static void main(String[] args) {
        System.out.println("WELCOME TO NUMBER GUESSING GAME \n Conditions: \n 1.There are three playRoundss \n 2.You can guess 5 times in each playAttempt \n 3.The score based on number of your playAttempts to guess the right number");
        Task1 t1 = new Task1();
        t1.playAttempt();
        t1.playRounds();
    }

    public int generateRandomNumber() {
        double randomno = (Math.random() * MAX_RAND_NUMBER) + 1;
        int randInt = (int) randomno;
        return randInt;
    }

    public String checkGuess(int guess, int number) {
        if (guess < number) {
            return "LOW";
        }
        if (guess > number) {
            return "HIGH";
        }
        return "CORRECT";
    }

    public void playAttempt() {
        int number = generateRandomNumber();
        // Scanner sc = new Scanner(System.in);
        int attempt = 0;
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            System.out.println("Enter a number:");
            int guess = sc.nextInt();
            attempt = attempt + 1;
            String result = checkGuess(guess, number);
            if (result.equals("LOW")) {
                System.out.println("Too LOW");
            } else if (result.equals("HIGH")) {
                System.out.println("Too HIGH");
            } else {
                System.out.println("Correct!!!");
                break;
            }
        }
        double score = ((double) (MAX_ATTEMPTS - attempt) / MAX_ATTEMPTS) * 100;
        System.out.println("Score=" + score + "%");
        if (attempt == MAX_ATTEMPTS) {
            System.out.println("The Random Number is: " + number);
        }
    }

    public void playRounds() {
        for (int i = 1; i < MAX_ROUNDS; i++) {
            System.out.println("If you want to continue the playAttempt to playRounds " + (i + 1) + " y/n:");
            // Scanner sc = new Scanner(System.in);
            String ques = sc.next();
            if (ques.equalsIgnoreCase("y")) {
                System.out.println("WELCOME TO playRounds: " + (i + 1));
                playAttempt();
            } else {
                break;
            }
        }
    }

}
