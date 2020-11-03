/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 02-08-2020
 *   Time: 10:45
 *   File: FizzBuzzSeries.java
 */

package selfPractice;

import java.util.Scanner;

public class FizzBuzzSeries {
    public static void main(String[] args) {
        System.out.print("Enter the last number of series : ");
        Scanner scannerObject = new Scanner(System.in);
        int lastNumber = scannerObject.nextInt();
        scannerObject.close();
        for (int number = 1; number <= lastNumber; number++) {
            boolean numberIfDivisibleByThree = (number % 3 == 0);
            boolean numberIfDivisibleByFive = (number % 5 == 0);
            if (numberIfDivisibleByThree && numberIfDivisibleByFive) {
                System.out.println("fizzbuzz");
            } else if (numberIfDivisibleByThree) {
                System.out.println("fizz");
            }
            else if (numberIfDivisibleByFive) {
                System.out.println("buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}