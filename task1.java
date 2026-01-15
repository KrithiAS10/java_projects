
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println("WELCOME TO NUMBER GUESSING GAME \n Conditions: \n 1.There are three rounds \n 2.You can guess 5 times in each attempt \n 3.The score based on number of your attempts to guess the right number");
        task1 t1 = new task1();
        t1.attempt();
        t1.round();
    }

    private static int rollDice() {
        double randomno = Math.random();
        randomno = randomno * 100;
        randomno = randomno + 1;
        int randInt = (int) randomno;
        return randInt;
    }

    public void attempt() {
        int roll = rollDice();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int x = sc.nextInt();
            if (x < roll) {
                System.out.println("Lesser than the random number");
            } else if (x > roll) {
                System.out.println("Greater than the random number");
            } else {
                System.out.println("Congratulations!!!!<3");
                break;
            }
        }
        count++;
        System.out.println("Score=" + ((5 - count) / 5) * 100 + "%");
    }

    public void round() {
        for (int i = 0; i < 2; i++) {
            System.out.println("If you want to continue the attempt to round " + (i + 1) + " y/n:");
            Scanner sc = new Scanner(System.in);
            String ques = sc.nextLine();
            if (ques.equals("y")) {
                System.out.println("WELCOME TO ROUND: 2");
                attempt();
            } else {
                break;
            }
        }
    }

}
