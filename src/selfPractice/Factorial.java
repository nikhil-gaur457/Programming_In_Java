/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 07-11-2020
 *   Time: 18:34
 *   File: Factorial.java
 */

package selfPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of factorial : ");
        int number = scanner.nextInt();
        for (int index = 1; index <= number; index++) {
            factorial = factorial * index;
        }
        System.out.println("Factorial of given number is " + factorial);
    }
}