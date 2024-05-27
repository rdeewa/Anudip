package L_Three;
public class Overload_cal {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add four doubles
    public double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    // Method to add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Method to add an array of doub	les
    public double add(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
    	Overload_cal calc = new Overload_cal();

        // Adding two integers
        int sumInt = calc.add(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        // Adding two doubles
        double sumDouble = calc.add(3.5, 2.5);
        System.out.println("Sum of doubles: " + sumDouble);

        // Adding three integers
        int sumThreeInt = calc.add(2, 4, 6);
        System.out.println("Sum of three integers: " + sumThreeInt);

        // Adding four doubles
        double sumFourDouble = calc.add(1.5, 2.5, 3.5, 4.5);
        System.out.println("Sum of four doubles: " + sumFourDouble);

        // Adding an array of integers
        int[] intArray = {1, 2, 3, 4, 5};
        int sumIntArray = calc.add(intArray);
        System.out.println("Sum of array of integers: " + sumIntArray);

        // Adding an array of doubles
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        double sumDoubleArray = calc.add(doubleArray);
        System.out.println("Sum of array of doubles: " + sumDoubleArray);
    }
}
