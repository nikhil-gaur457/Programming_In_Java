/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 14-02-2021
 *   Time: 00:10
 *   File: FrogSort.java
 */

package codeChef;

import java.util.Scanner;

public class FrogSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] arrW = new int[N];
            int[] arrL = new int[N];
            for (int i = 0; i < N; i++) {
                arrW[i] = scanner.nextInt();
            }
            for (int i = 0; i < N; i++) {
                arrL[i] = scanner.nextInt();
            }
            if (N == 2) {
                if (arrW[0] == 1 && arrW[1] == 2) {
                    System.out.println("0");
                } else {
                    if (arrL[0] == 1) {
                        System.out.println("2");
                    } else {
                        System.out.println("1");
                    }
                }
            } else if (N == 3) {
                int a = 0, b = 0, c = 0, ap, bp = 0, cp = 0;
                int ans = 0;
                for (int i = 0; i < N; i++) {
                    if (arrW[i] == 1) {
                        a = i;
                        ap = i;
                    } else if (arrW[i] == 2) {
                        b = i;
                        bp = i;
                    } else if (arrW[i] == 3) {
                        c = i;
                        cp = i;
                    }
                }
                while (c <= b || b <= a || c <= a) {
                    while (b <= a) {
                        b += arrL[bp];
                        ans++;
                    }
                    while (c <= b || c <= a) {
                        c += arrL[cp];
                        ans++;
                    }
                }
                System.out.println(ans);
            } else if (N == 4) {
                int a = 0, b = 0, c = 0, d = 0, ap, bp = 0, cp = 0, dp = 0;
                int ans = 0;
                for (int i = 0; i < N; i++) {
                    if (arrW[i] == 1) {
                        a = i;
                        ap = i;
                    } else if (arrW[i] == 2) {
                        b = i;
                        bp = i;
                    } else if (arrW[i] == 3) {
                        c = i;
                        cp = i;
                    } else if (arrW[i] == 4) {
                        d = i;
                        dp = i;
                    }
                }
                while (d <= a || d <= b || d <= c || c < b || b <= a || c <= a) {
                    while (b <= a) {
                        b += arrL[bp];
                        ans++;
                    }
                    while (c <= b || c <= a) {
                        c += arrL[cp];
                        ans++;
                    }
                    while (d <= a || d <= b || d <= c) {
                        d += arrL[dp];
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}