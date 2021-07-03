/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-05-2021
 *   Time: 13:40
 *   File: PalindromicString.java
 */

package hackerrank;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int d = scanner.nextInt();
        int n = s.length();
        int maxFrequency = 0;
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                maxFrequency++;
            }
        }
        if (maxFrequency >= d) {
            System.out.println(maxFrequency+d);
        } else {
            System.out.println("-1");
        }
    }
}