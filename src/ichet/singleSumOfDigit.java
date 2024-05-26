package ichet;

public class singleSumOfDigit {

    public static void main(String[] args) {
        int number = 38154;
        int result = sumUntilSingleDigit(number);
        System.out.println("The single-digit sum of the number is: " + result);
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Method to repeatedly sum digits until a single digit is obtained
    public static int sumUntilSingleDigit(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }
}

