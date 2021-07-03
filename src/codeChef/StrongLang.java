/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-04-2021
 *   Time: 20:57
 *   File: StrongLang.java
 */

package codeChef;

import java.util.Locale;
import java.util.Scanner;

public class StrongLang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            String S = scanner.next();
            String Si = S.toLowerCase();
            int count = 0;
            int maxCount = 0;
            for (int i = 0; i < N; i++) {
                if (Si.charAt(i) == '*') {
                    count++;
                    if (count >= maxCount) {
                        maxCount = count;
                    }
                } else {
                    count = 0;
                }
            }
            if (maxCount >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}