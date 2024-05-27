package L_One;

import java.util.Scanner;

public class SumOfTwoNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int a = Integer.parseInt(sc.nextLine()) ;
	        System.out.print("Enter the second number: ");
	        int b = Integer.parseInt(sc.nextLine()) ;
	        int sum = a + b;
	        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
	        sc.close();
	        }
	}
