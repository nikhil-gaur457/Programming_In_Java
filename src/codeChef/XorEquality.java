/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-05-2021
 *   Time: 16:32
 *   File: XorEquality.java
 */

package codeChef;

import java.util.Scanner;

public class XorEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long modulo = 1000000007;
            long answer = numbersMatch(2, n - 1, modulo);
            System.out.println(answer);
        }
    }

    static long numbersMatch(long x, long y, long modulo) {
        long result = 1;
        x = x % modulo;
        if (x == 0) {
            return 0;
        }
        while (y > 0) {
            if ((y & 1) != 0) {
                result = (result * x) % modulo;
            }
            y = y >> 1;
            x = (x * x) % modulo;
        }
        return result;
    }
}