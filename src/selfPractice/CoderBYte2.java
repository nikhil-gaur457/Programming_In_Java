/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-01-2023
 *   Time: 22:54
 *   File: CoderBYte2.java
 */

package selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        int[][] dp = new int[n][26];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            adj[x].add(y);
        }

        int lo = 1;
        int hi = n;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], 0);
            }
            for (int c = 0; c < 26; c++) {
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == (char) ('a' + c)) {
                        dp[i][c] = 1;
                    } else {
                        int max_len = 0;
                        for (int j : adj[i]) {
                            int d = s.charAt(j) - 'a';
                            max_len = Math.max(max_len, dp[j][d]);
                        }
                        dp[i][c] = max_len + 1;
                    }
                }
            }
            boolean found = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 26; j++) {
                    if (dp[i][j] >= mid) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        if (lo == n) {
            System.out.println("-1");
        } else {
            System.out.println(lo);
        }
    }
}
