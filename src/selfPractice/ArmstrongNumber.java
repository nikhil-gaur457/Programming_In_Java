/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 07-11-2020
 *   Time: 19:01
 *   File: ArmstrongNumber.java
 */

package selfPractice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number, sum = 0, remainder, copy, temp1, temp2;
        System.out.print("Enter any number to check : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        copy = number;
        while (number != 0) {
            remainder = number % 10;
            sum = sum + (remainder * remainder * remainder);
            number = number / 10;
        }
        if (copy == sum) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
    }
}