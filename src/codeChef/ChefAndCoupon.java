/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-02-2021
 *   Time: 18:00
 *   File: ChefAndCoupon.java
 */

package codeChef;

import java.util.Scanner;

public class ChefAndCoupon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int D = scanner.nextInt();
            int C = scanner.nextInt();
            int[] A = new int[3];
            int[] B = new int[3];
            for (int i = 0; i < 3; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                B[i] = scanner.nextInt();
            }
            int sumOfA = 0;
            int sumOfB = 0;
            for (int i = 0; i < 3; i++) {
                sumOfA = sumOfA + A[i];
                sumOfB = sumOfB + B[i];
            }
            int DeliveryChargesOfTwoDays = 2 * D;
            int sumWithCoupon = sumOfA + sumOfB + C;
            int sumWithoutCoupon = sumOfA + sumOfB + DeliveryChargesOfTwoDays;
            if (sumOfA >= 150 && sumOfB >= 150) {
                if (sumWithCoupon < sumWithoutCoupon) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (sumOfA >= 150 && sumOfB < 150) {
                if ((sumOfA + sumOfB + C + D) < (sumOfA + sumOfB + D + D)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else if (sumOfA < 150 && sumOfB >= 150) {
                if ((sumOfA + sumOfB + D + C) < (sumOfA + sumOfB + D + D)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}