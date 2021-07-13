/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-07-2021
 *   Time: 21:10
 *   File: MaximumProduction.java
 */

package codeChef;

import java.util.Scanner;

public class MaximumProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int wayOne = 7 * x;
            int wayTwo = (d * y) + (7 - d) * z;
            int answer = Math.max(wayOne, wayTwo);
            System.out.println(answer);
        }
    }
}