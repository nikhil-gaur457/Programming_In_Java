/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-07-2021
 *   Time: 21:39
 *   File: XxOoRr.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XxOoRr {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t;
        int ans;
        t = Integer.parseInt(bf.readLine());
        while ((t--) != 0) {
            int n = Integer.parseInt(bf.readLine());
            int k = Integer.parseInt(bf.readLine());
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(bf.readLine());
            }
            int[] nBit = new int[31];
            int c;
            for (int j = 0; j <= 30; j++) {
                c = 0;
                for (int i =0; i < n; i/=2) {
                    if (i % 2 != 0) {
                        c++;
                    }
                }
                nBit[j] = c;
            }
            ans = 0;
            for (int j = 0; j <= 30; j++) {
                if (nBit[j] % k == 0) {
                    ans += nBit[j] / k;
                } else {
                    ans += nBit[j] / k + 1;
                }
            }
            System.out.println(ans);
        }
    }
}