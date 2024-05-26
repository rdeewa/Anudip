package MyProg;
import java.util.Scanner;

public class starP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter number for print star:");
			int n = sc.nextInt();
			System.out.println();
			System.out.println("Star Pattern 1:- ");
			if(n == 0) {
				System.out.println("Now the loop is ended");
				break;
			}
			star1(n);
			star2(n);
			star3(n);
			star4(n);
			star5(n);
			star6(n);
		}
		sc.close();
	}



	//it is for pattern 1
	public static void star1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		System.out.println();
	}

	//it is for pattern 2
	public static void star2(int n) {
		System.out.println("Star Pattern 2:-");
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		System.out.println(); 
	}

	//it is for pattern 3
	public static void star3(int n) {
		System.out.println("Star Pattern 3:-");
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n - row + 1; col++) {
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}

	//it is for pattern 4
	public static void star4(int n) {
		System.out.println("Star Pattern 4:-");
		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row ; col++) {
				System.out.print(col); 
			}
			System.out.println(); 
		}
	}


	//it is for pattern 5
	public static void star5(int n) {

		System.out.println("Star Pattern 5:-");
		for(int row = 0; row < 2*n; row++) {
			int totalColInRow = row > n ? 2*n-row :row;
			for(int col = 0; col < totalColInRow; col++) {
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}

	//it is for pattern 6
	public static void star6(int n) {

		System.out.println("Star Pattern 6:-");
		for(int row = 0; row < 2*n; row++) {
			int totalColInRow = row > n ? 2*n-row :row;
			
			int noOfSpaces = n - totalColInRow;
			for(int s = 0; s < noOfSpaces; s++) {
				 System.out.print(" ");
			}
			for(int col = 0; col < totalColInRow; col++) {
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}




}
