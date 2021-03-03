
/**
 * Task8Methods
 *
 * @author Aurangzaib Danial Liaqat Khan
 * @version 03/03/2021
 */

import java.util.Scanner;

public class Methods
{
    public static void main(String[] args) {
        printArray(readIntegerArray());
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.err.println("Error! You must enter a whole integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int[] readIntegerArray() {
        int[] anArrayOfIntegers = new int[10]; 
        
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Please enter a whole number.");

            anArrayOfIntegers[counter] = readInteger();
        }
        
        return anArrayOfIntegers;
    }

    public static void printArray(int[] integers) {
        for (int counter = 0; counter < integers.length; counter++) {
            System.out.println(integers[counter]);
        }
    }

}
