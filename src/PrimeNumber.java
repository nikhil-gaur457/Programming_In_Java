/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-01-2023
 *   Time: 17:28
 *   File: PrimeNumber.java
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println("Yes");
                break;
            }
        }
    }
}