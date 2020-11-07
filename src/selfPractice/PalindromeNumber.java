/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 07-11-2020
 *   Time: 18:43
 *   File: PalindromeNumber.java
 */

package selfPractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number, reverse = 0, temp;
        System.out.print("Enter a number to check : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int index = number; index > 0; index=index/10) {
            temp = index%10;
            reverse = reverse * 10 + temp;
        }
        if (reverse == number) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}