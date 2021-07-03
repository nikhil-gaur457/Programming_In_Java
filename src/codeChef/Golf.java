/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-05-2021
 *   Time: 15:28
 *   File: Golf.java
 */

package codeChef;

import java.io.IOException;
import java.util.Scanner;

public class Golf {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-->0) {
            int N = scanner.nextInt();
            int x = scanner.nextInt();
            int k = scanner.nextInt();
            int s = (N+1)%k;
            if (x%k == 0 || x%k == s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}