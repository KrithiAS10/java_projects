
import java.util.Scanner;

public class Task2 {

    static Scanner sc = new Scanner(System.in);
    public int[] sub = new int[8];
    public static String[] subName = {"SEPA", "CN", "TOC", "AI", "WEB", "MiniPro", "RE", "EVS"};
    public int total;
    public double avg = 0;
    public String g;

    public void inputMark() {
        System.out.println("Enter the marks in following subject:");
        for (int i = 0; i < sub.length; i++) {
            System.out.print(subName[i] + ":");
            sub[i] = sc.nextInt();
            if (sub[i] < 0 || sub[i] > 100) {
                System.out.println("Invalid marks!...Enter again.");
                i--;
            }
            System.out.print("\n");
        }
    }

    public int totalMark() {
        total = 0;
        for (int i = 0; i < sub.length; i++) {
            total += sub[i];
        }
        return total;
    }

    public void calculatePercentage() {
        avg = (double) ((double) total / 800) * 100;
        System.out.println((int) avg + "%");
    }

    public void grade() {
        if (avg >= 90) {
            System.out.println("Grade=A+");
        } else if (avg >= 80) {
            System.out.println("Grade=A");
        } else if (avg >= 70) {
            System.out.println("Grade=B+");
        } else if (avg >= 60) {
            System.out.println("Grade=B");
        } else if (avg >= 50) {
            System.out.println("Grade=C+");
        } else if (avg >= 40) {
            System.out.println("Grade=C");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.inputMark();
        System.out.println("Total Marks: " + t2.totalMark());
        t2.calculatePercentage();
        t2.grade();
    }
}
