/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 19-09-2021
 *   Time: 22:28
 *   File: AdjacencyHatred.java
 */

package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyHatred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int even = 0;
            int odd = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (even == 0 && odd > 0) {
                System.out.println("-1");
            }
            if (odd == 0 && even > 0) {
                System.out.println("-1");
            }
            Arrays.sort(arr);
            if (odd > 0 && even > 0) {
                for (int i = 0; i < N; i++) {
                    if (arr[i] % 2 != 0) {
                        System.out.print(arr[i] + " ");
                    }
                    if (arr[i] % 2 == 0) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }
    }
}