/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 03-11-2020
 *   Time: 18:26
 *   File: LeapYearOrNot.java
 */

package selfPractice;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year or not : ");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else if (year % 100 ==0) {
            System.out.println(year + " is not a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}