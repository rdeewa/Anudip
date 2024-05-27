package L_Two;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			int a = 1;
			while(a<=10){
				int ans = num*a;
				System.out.println(ans);
				a++;
			}
		}
	}
}


