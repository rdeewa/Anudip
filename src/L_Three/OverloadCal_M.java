package L_Three;


public class OverloadCal_M {
	public static void main(String[] args) {
		ACalculator AC = new ACalculator();
		System.out.println(AC.add(2, 3, 5));
	}
}
class Calculator{
	int a;
	int b;

	public int add(int a, int b) {
		return a+b;
	}
}

class ACalculator extends Calculator{
	int c;
	public int add(int a, int b, int c) {
		return super.add(a , b) + c;

	}
}
