/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 02-11-2020
 *   Time: 17:30
 *   File: EvenOdd.java
 */

package selfPractice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Please enter a number to check : ");
        // create a program to check a number is even or odd
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is even.");
        } else {
            System.out.println(a + " is odd.");
        }
    }
}