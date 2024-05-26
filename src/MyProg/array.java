package MyProg;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Input the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Finding indices of two elements that sum up to the target value
        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                found = true;
                break;
            }
            map.put(array[i], i);
        }
        
        if (!found) {
            System.out.println("Plesse Enter a valid target.");
        }
        scanner.close();
    }
}




/*public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine()); // Read the size as a string and then parse it to an integer
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine()); // Read the element as a string and then parse it to an integer
        }

        // Input the target value
        System.out.print("Enter the target value: ");
        int target = Integer.parseInt(scanner.nextLine()); // Read the target value as a string and then parse it to an integer

        // Finding indices of two elements that sum up to the target value
        for (int i = 0; i < size; i++) {
            int complement = target - array[i];
            for (int j = i + 1; j < size; j++) {
                if (array[j] == complement) {
                    System.out.println("Indices: " + i + " and " + j);
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println("No two elements sum up to the target value.");
        scanner.close();
    }
}*/


