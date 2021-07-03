/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-04-2021
 *   Time: 19:32
 *   File: Socks1.java
 */

package codeChef;

import java.util.Scanner;

public class Socks1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A==B) {
            System.out.println("YES");
        }
        else if (A==C) {
            System.out.println("YES");
        }
        else if (B == C) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}