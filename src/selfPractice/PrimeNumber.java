/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 11-11-2020
 *   Time: 18:01
 *   File: PrimeNUmber.java
 */

package selfPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= n / 2; i++) {
            int x = n % i;
            if (x == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }
}