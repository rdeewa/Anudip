package L_Two;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean prog = true;
		while (prog) {
			System.out.println("Enter the number: ");
			String ch = sc.nextLine();
			//int num = sc.nextInt();
			//sc.nextLine();
			if (ch.equals("exit")) {
				prog = false;
				break;
			}
			int num;
			num = Integer.parseInt(ch);

			if(num>0) {
				System.out.println(num+ "it is a positive number");
			}else if(num==0){
				System.out.println(num+ "it is neutral number");
			}else {
				System.out.println(num+ "it is a negetive number");
			}

		}
		sc.close();
	}
}

