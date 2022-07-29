/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-07-2022
 *   Time: 22:57
 *   File: Infosys2.java
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Infosys2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(findWays(n, k));
    }


    public static int dfs(int i, int k, int n, int[][] dp) {
        if (k == 0) {
            return 1;
        }
        if (dp[i][k] != -1) {
            return dp[i][k];
        }
        int res = 0;
        for (int j = i; j <= n; j++) {
            if (j%i == 0) {
                res = (res%10000 + dfs(j, k-1, n, dp) % 10000);
            }
        }
        return dp[i][k] = res%10000;
    }
    public static int findWays(int n, int k) {
        int[][] dp = new int[k+1][];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = (ans % 10000 + dfs(i, k-1, n, dp)%10000);
        }
        return ans;
    }
}