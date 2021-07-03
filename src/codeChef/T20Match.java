/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-03-2021
 *   Time: 16:07
 *   File: T20Match.java
 */

package codeChef;

import java.util.Scanner;

public class T20Match {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int O = scanner.nextInt();
        int C = scanner.nextInt();
        int remainingOver = 20-O;
        int ballsRemaining = remainingOver*6;
        int maxScoreInRemainingOver = ballsRemaining*6;
        if (C+maxScoreInRemainingOver > R) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}