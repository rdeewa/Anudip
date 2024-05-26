package Anudip;

import java.util.Scanner;

public class mx_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int max =0;
        if (a>b){
          max = a;
        }
        else {
          max = b;
         
        }
        //int max = Math.max(a, b);
      System.out.println("the max number is:"+max);
	}

}
