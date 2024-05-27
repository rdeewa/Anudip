package L_Two;

import java.util.Scanner;


public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        int score;
        String ex;
        while (true) {
            System.out.print("Enter student's score");
            score = sc.nextInt();
            ex = sc.nextLine();
             if (ex.equals("exit")) {
                System.out.println("Exiting program...");
                break;
            }
            if (score >= 0 && score <= 100) {
                if (score >= 90) {
                    grade = 'A';
                } else if (score >= 80) {
                    grade = 'B';
                } else if (score >= 70) {
                    grade = 'C';
                } else if (score >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("Grade: " + grade);
            } else {
                System.out.println("Invalid score! Score must be between 0 and 100.");
            }
        }
        sc.close();
    }
}
