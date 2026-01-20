
import java.util.Scanner;

public class Task2 {

    public int[] sub = new int[8];
    public static String[] subName = {"SEPA", "CN", "TOC", "AI", "WEB", "MiniPro", "RE", "EVS"};
    public int total = 0;
    public double avg = 0;
    public String g;

    public void inputMark() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in following subject:");
        for (int i = 0; i < 8; i++) {
            System.out.print(subName[i] + ":");
            sub[i] = sc.nextInt();
            System.out.print("\n");
        }
    }

    public int totalMark() {
        for (int i = 0; i < 8; i++) {
            System.out.println(subName[i] + ":" + sub[i]);
            total += sub[i];
        }
        return total;
    }

    public void avrgMark() {
        avg = (double) ((double) total / 800) * 100;
        System.out.println((int) avg + "%");
    }

    public void grade() {
        if (avg >= 90) {
            System.out.println("Grade=A+");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Grade=A");
        } else if (avg >= 70) {
            System.out.println("Grade=B+");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade=B+");
        } else if (avg >= 50) {
            System.out.println("Grade=B+");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("Grade=B+");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.inputMark();
        System.out.println("Total Marks: " + t2.totalMark());
        t2.avrgMark();
        t2.grade();
    }
}
