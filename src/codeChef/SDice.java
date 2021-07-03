/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-04-2021
 *   Time: 21:49
 *   File: SDice.java
 */

package codeChef;

import java.util.Scanner;

public class SDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            long N = scanner.nextLong();
            long multipleOfFour = N / 4;
            long rem = N % 4;
            long maxPips = 0;
            if (N == 1) {
                maxPips = 20;
            } else if (N == 2) {
                maxPips = 2 * (6 + 5 + 4 + 3);
            } else if (N == 3) {
                maxPips = 2 * (6 + 5 + 4 + 3) + 6 + 5 + 4;
            } else if (N >= 4) {
                if (rem == 0) {
                    maxPips += 4 * (6 + 5) * (multipleOfFour);
                    maxPips += 4 * 4;
                } else if (rem == 1) {
                    maxPips += 4 * (6 + 5) * (multipleOfFour);
                    maxPips += 3 * 4;
                    maxPips += 6 + 5 + 4 + 3 + 2;
                } else if (rem == 2) {
                    maxPips += 4 * (6 + 5) * (multipleOfFour);
                    maxPips += 4;
                    maxPips += 2 * (6 + 5 + 4 + 3 + 2);
                } else if (rem == 3) {
                    maxPips += 4 * (6 + 5) * (multipleOfFour);
                    maxPips += 4;
                    maxPips += 2 * (6 + 5 + 4 + 3) + 6 + 5 + 4;
                }
            }
            System.out.println(maxPips);
        }
    }
}