/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 30-04-2021
 *   Time: 19:35
 *   File: ColdPlay.java
 */

package codeChef;

import java.util.Scanner;

public class ColdPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int M = scanner.nextInt();
            int S = scanner.nextInt();
            int totalPlay = M/S;
            System.out.println(totalPlay);
        }
    }
}