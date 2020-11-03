/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 03-11-2020
 *   Time: 18:09
 *   File: PrintReverseNumber.java
 */

package selfPractice;

import java.util.Scanner;

public class PrintReverseNumber {
    public static void main(String[] args) {
        int number, reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number which you want to reverse : ");
        number = scanner.nextInt();
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        }
        System.out.println("Reverse of entered number is " + reverse);
    }
}