/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 10-04-2021
 *   Time: 18:35
 *   File: Xyz.java
 */

package codeChef;

import java.util.Scanner;

public class Xyz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int K = scanner.nextInt();
            int[][] matA = new int[N+1][M+1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    matA[i][j] = scanner.nextInt();
                }
            }


            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    matA[i][j] += matA[i][j - 1];
                }
            }
            for (int j = 1; j <= M; j++) {
                for (int i = 1; i <= N; i++) {
                    matA[i][j] += matA[i - 1][j];
                }
            }

            int ans = 0;

            for (int index = 1; index <= N; index++) {
                for (int i = 1; i <= N - index + 1; i++) {
                    int smallest = 1;
                    int largest = M - index + 1;
                    int middle;
                    int p = 0;
                    int flag = 0;

                    while (smallest <= largest) {
                        middle = (largest + smallest) / 2;
                        int sum = matA[i + index - 1][middle + index - 1] - matA[i + index - 1][middle - 1] - matA[i - 1][middle + index - 1] + matA[i - 1][middle - 1];

                        if (sum >= K * index * index) {
                            largest = middle - 1;
                            p = middle;
                            flag = 1;
                        } else {
                            smallest = middle - 1;
                        }
                    }
                    if (flag == 1) {
                        ans += (M - index - p + 2);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}