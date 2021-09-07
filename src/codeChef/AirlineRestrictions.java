/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 06-09-2021
 *   Time: 20:05
 *   File: AirlineRestrictions.java
 */

package codeChef;

import java.util.Scanner;

public class AirlineRestrictions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            int E = scanner.nextInt();
            if (((A + B) <= D) && (C <= E)) {
                System.out.println("Yes");
            } else if (((B + C) <= D) && (A <= E)) {
                System.out.println("Yes");
            } else if (((A + C) <= D) && (B <= E)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}