/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 17-02-2022
 *   Time: 11:35
 *   File: ChefAndTriples.java
 */

package codeChef;

import java.util.Scanner;

public class ChefAndTriples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    for (int k = 1; k <= c; k++) {
                        if (N == (i*j*k)) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}