package Anudip;

import java.util.Scanner;

public class Fec {
		int fact  =1;
	public static void main(String[] args) {
		int res;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Fec f = new Fec();
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
