/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-08-2021
 *   Time: 19:50
 *   File: KthMax.java
 */

package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class KthMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < K; i++) {
                if (arr[i] < 0) {
                    arr[i] = arr[i] * (-1);
                }
            }
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > 0) {
                    sum = sum + arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}