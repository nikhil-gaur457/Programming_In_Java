/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-04-2021
 *   Time: 23:30
 *   File: PassingMarks.java
 */

package codeChef;

import java.util.Scanner;

public class PassingMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T -- > 0) {
            int aMin = sc.nextInt();
            int bMin = sc.nextInt();
            int cMin = sc.nextInt();
            int tMin = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A >= aMin && B >= bMin && C >= cMin) {
                if (A+B+C >= tMin) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}