/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 03-11-2020
 *   Time: 17:37
 *   File: SquareRoot.java
 */

package selfPractice;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        double number,result;
        System.out.print("Please enter a number to find square root : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextDouble();
        result = Math.sqrt(number);
        System.out.println("Square root of given number is " + result);
    }
}