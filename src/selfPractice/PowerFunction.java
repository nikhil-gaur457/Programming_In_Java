/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 03-11-2020
 *   Time: 17:52
 *   File: PowerFunction.java
 */

package selfPractice;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as base : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter a number as power : ");
        double number2 = scanner.nextDouble();
        double result = Math.pow(number1, number2);
        System.out.println(result + " is the solution of the given query.");
    }
}