/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-09-2021
 *   Time: 17:54
 *   File: TravelPass.java
 */

package codeChef;

import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == '0') {
                    count += A;
                } else {
                    count += B;
                }
            }
            System.out.println(count);
        }
    }
}