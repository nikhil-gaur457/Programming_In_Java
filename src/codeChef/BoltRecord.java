/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 02-04-2021
 *   Time: 19:44
 *   File: BoltRecord.java
 */

package codeChef;

import java.util.Scanner;

public class BoltRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        float worldRecord = (float) 9.575;
        while (T-- > 0) {
            float k1 = scanner.nextFloat();
            float k2 = scanner.nextFloat();
            float k3 = scanner.nextFloat();
            float v = scanner.nextFloat();
            float totalSpeed = k1*k2*k3*v;
            float totalTime = 100/totalSpeed;
            if (totalTime< worldRecord) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}