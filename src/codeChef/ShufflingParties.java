/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 06-09-2021
 *   Time: 20:16
 *   File: ShufflingParties.java
 */

package codeChef;

import java.util.Scanner;

public class ShufflingParties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int odd = (int) Math.ceil(N / 2.0);
            int even = N / 2;
            int countOdd = 0;
            int countEven = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 != 0) {
                    countOdd++;
                } else {
                    countEven++;
                }
            }
            int ans = Math.min(countOdd, even) + Math.min(countEven, odd);
            System.out.println(ans);
        }
    }
}