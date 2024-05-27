package L_One;

import java.util.Scanner;

public class FectorialNum {

	int fact  =1;
	public static void main(String[] args) {
		int res;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        FectorialNum f = new FectorialNum();
        res = f.calFact(num);
        System.out.println(res);
	}
	int calFact(int num) {
		if(num>1) {
			fact = fact * num;
			calFact(num-1);
		}
		return fact;
	}

}
