/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 10-07-2022
 *   Time: 14:01
 *   File: JulyLong8.java
 */

package codeChef;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JulyLong8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n+1];
            for (int i = 0; i < n+1; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] ans = {0, 0, 0};
            for (int i = highestPowerOfTwo(n); i > 0; i/=2) {
                int difference = arr[i]-arr[0];
                if (difference < 0) {
                    difference*=-1;
                    int count = difference/i;
                    if (count == 1) {
                        count = 2;
                        if ((ans[0]^i) <= n) {
                            ans[1]^=i;
                            count--;
                        }
                        if (count <= n && (ans[1]^i) <= n) {
                            ans[1]^=i;
                            count--;
                        }
                        if (count > 0 && (ans[2]^i) <= n) {
                            ans[2]^=i;
                        }
                    } else if (count == 3) {
                        ans[0]^=i;
                        ans[1]^=i;
                        ans[2]^=i;
                    }
                } else {
                    int count = difference/i;
                    if (count == 1) {
                        if ((ans[0]^i) <= n) {
                            ans[0]^=i;
                        } else if ((ans[1]^i)<= n) {
                            ans[1]^=i;
                        } else {
                            ans[2]^=i;
                        }
                    }
                }
                Arrays.sort(ans);
            }
            System.out.println(ans[0] + ans[1] + ans[2]);
        }
    }

    private static int highestPowerOfTwo(int n) {
        int result = 0;
        for (int i = n; i >= 1 ; i--) {
            if ((i &(i-1)) == 0) {
                result = i;
                break;
            }
        }
        return result;

    }
}