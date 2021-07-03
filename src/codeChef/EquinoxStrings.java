/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 30-04-2021
 *   Time: 19:43
 *   File: EquinoxStrings.java
 */

package codeChef;

import java.util.Scanner;

public class EquinoxStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long countA = 0;
            long countB = 0;
            for (int i = 0; i < N; i++) {
                String sUpperCase = scanner.next();
                if (sUpperCase.charAt(0) == 'E' || sUpperCase.charAt(0) == 'Q' || sUpperCase.charAt(0) == 'U' ||
                        sUpperCase.charAt(0) == 'I' || sUpperCase.charAt(0) == 'N' || sUpperCase.charAt(0) == 'O' ||
                        sUpperCase.charAt(0) == 'X') {
                    countA += A;
                } else {
                    countB += B;
                }
            }
            if (countA == countB) {
                System.out.println("DRAW");
            } else if (countB > countA) {
                System.out.println("ANURADHA");
            } else {
                System.out.println("SARTHAK");
            }
        }
    }
}