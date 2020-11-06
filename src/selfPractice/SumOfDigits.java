/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 06-11-2020
 *   Time: 21:04
 *   File: SumOfDigits.java
 */

package selfPractice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number, remainder, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find sum : ");
        number = scanner.nextInt();
        while (number != 0) {
            remainder = number%10;
            sum = sum + remainder;
            number = number/10;
        }
        System.out.println("Sum of digits of given number is " + sum);
    }
}