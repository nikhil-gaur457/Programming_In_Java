/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-04-2021
 *   Time: 17:53
 *   File: HiringTest1.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HiringTest1 {
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
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = bf.readLine();
            }
            for (int i = 0; i < N; i++) {
                String s = arr[i];
                int countF = 0;
                int countP = 0;
                for (int j = 0; j < M; j++) {
                    if (s.charAt(j) == 'P') {
                        countP++;
                    } else if (s.charAt(j) == 'F') {
                        countF++;
                    }
                }
                if ((countF >= X) || ((countF >= X - 1) && countP >= Y)) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}