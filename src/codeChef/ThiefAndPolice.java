/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-04-2021
 *   Time: 18:45
 *   File: ThiefAndPolice.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThiefAndPolice {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        while (T-- > 0) {
            String[] nm = bf.readLine().split(" ");
            int N = Integer.parseInt(nm[0]);
            int M = Integer.parseInt(nm[1]);
            String[] xy = bf.readLine().split(" ");
            int X = Integer.parseInt(xy[0]);
            int Y = Integer.parseInt(xy[1]);
            String[] ab = bf.readLine().split(" ");
            int aInteger = Integer.parseInt(ab[0]);
            int bInteger = Integer.parseInt(ab[1]);
            solve(N, M, X, Y, aInteger, bInteger);
        }
    }

    private static void solve(int n, int m, int x, int y, int a, int b) {
        int chorKaTimeBadiyaWala = (m - y) + (n - x);
        int policeAKaBadaWalaTime = n - a;
        int policeBKaBadaWalaTIme = m - b;
        int policeMinDiagonalHueHueHue = Math.min(policeAKaBadaWalaTime, policeBKaBadaWalaTIme);
        a += policeMinDiagonalHueHueHue;
        b += policeMinDiagonalHueHueHue;
        int policeKaTimeBadiyaWala = policeMinDiagonalHueHueHue + (n - a) + (m - b);
        if (chorKaTimeBadiyaWala <= policeKaTimeBadiyaWala) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}