package L_Two;

import java.util.Scanner;
public class revNum {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			int ans = 0;
			while(num>0) {
				int rem = num % 10;
				num /= 10;
				ans =  ans * 10 + rem;
			}
			System.out.println(ans);

		}
	}

}

