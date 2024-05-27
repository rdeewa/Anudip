package L_One;

import java.util.Scanner;

public class votingAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int a = sc.nextInt();
			
			int age = a;
		
		
		if(age>=18) {
			System.out.println("You're eligible for voting");
		}else {
			System.out.println("You're not eligible for voting");
			}
		
	}

}

