/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 30-04-2021
 *   Time: 20:46
 *   File: ChefInHeaven.java
 */

package codeChef;

import java.util.Scanner;

public class ChefInHeaven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int L = scanner.nextInt();
            String S = scanner.next();
            int goodDeeds = 0;
            int badDeeds = 0;
            int flag = 0;
            int remainingYears = 1;
            for (int i = 0; i < L; i++) {
                if (S.charAt(i) == '1') {
                    goodDeeds++;
                } else {
                    badDeeds++;
                }
                int totalGoodYears = ((goodDeeds * 100) / remainingYears);
                if (totalGoodYears >= 50) {
                    flag = 1;
                    System.out.println("YES");
                    break;
                }
                remainingYears++;
            }
            if (flag == 0) {
                System.out.println("NO");
            }
        }
    }
}