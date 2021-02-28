/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 14-02-2021
 *   Time: 02:53
 *   File: PrimeGame.java
 */

package codeChef;

import java.util.Scanner;

public class PrimeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int[] p = new int[X];
            int count = 0;
            if (X <= Y) {
                System.out.println("Chef");
            } else {
                System.out.println("Divyam");
            }
        }
    }
}
/*


    private static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}*/
