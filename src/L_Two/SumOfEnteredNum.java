package L_Two;

import java.util.Scanner;

public class SumOfEnteredNum {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number to sum: ");
        int N = scanner.nextInt();
        
        int sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum = sum + num;
        }
        
        System.out.println("Sum of entered numbers: " + sum);
        
        scanner.close();
    }
}

