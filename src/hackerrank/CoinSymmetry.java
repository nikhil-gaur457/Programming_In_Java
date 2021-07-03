/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-05-2021
 *   Time: 14:53
 *   File: CoinSymmetry.java
 */

package hackerrank;

import java.util.Scanner;

public class CoinSymmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String sb = scanner.next();
            StringBuilder s = new StringBuilder(sb);
            int k = scanner.nextInt();
            int count = 0;
            for (int i = 0; i <= s.length() - k; i++) {
                if (s.charAt(i) == 'T') {
                    count++;
                    for (int j = i; j < i + k; j++) {
                        if (s.charAt(i) == 'T') {
                            s.setCharAt(j, 'H');
                        } else {
                            s.setCharAt(j, 'T');
                        }
                    }
                }
            }
            boolean fine = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'T') {
                    fine = false;
                    break;
                }
            }
            if (fine) {
                System.out.println(count);
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}