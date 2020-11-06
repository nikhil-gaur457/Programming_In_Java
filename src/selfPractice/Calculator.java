/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 06-11-2020
 *   Time: 21:47
 *   File: Calculator.java
 */

package selfPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int number2 = scanner.nextInt();
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sum of two numbers is " + (number1 + number2));
                break;
            case 2:
                System.out.println("difference of two numbers is " + (number1 - number2));
                break;
            case 3:
                System.out.println("product of two numbers is " + (number1 * number2));
                break;
            case 4:
                System.out.println("quotient of two numbers is " + (number1 / number2));
                break;
            default:
                System.out.println("You entered wrong choice!");
        }
    }
}