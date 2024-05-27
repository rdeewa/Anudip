package L_Two;

import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Year: ");
	        int res = sc.nextInt();
	        if (res % 4 == 0) {
	            if (res % 100 != 0 || res % 400 == 0) {
	                System.out.println(res + " is a leap year");
	            } else {
	                System.out.println(res + " is not a leap year");
	            }  
	        } else {
	            System.out.println(res + " is not a leap year");
	        }*/
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("Enter the Year: ");
			int res = sc.nextInt();
			if (res == 0) {
				running = false;
				break;
			}
			if(res % 4==0) {
				if(res % 100==0) {
					if(res % 400==0) {
						System.out.println(res+ " it is a leap year");
					}else {
						System.out.println(res+ " it is not a leap year");
					}

				}else {
					System.out.println(res+ " it is a leap year");
				}
			}else {
				System.out.println(res+ " it is not a leap year");
			}
		}
		sc.close(); 
	} 
}

