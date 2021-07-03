/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-03-2021
 *   Time: 17:34
 *   File: CollegeLife5.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CollegeLife5 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(bufferedReader.readLine());
            int M = Integer.parseInt(bufferedReader.readLine());
            int[] fI = new int[N];
            int[] cI = new int[M];
            int switchCountCricket = 0;
            int switchCountFootball = 0;
            for (int i = 0; i < N; i++) {
                fI[i] = Integer.parseInt(String.valueOf(bufferedReader.read()));
            }
            for (int j = 0; j < M; j++) {
                cI[j] = Integer.parseInt(bufferedReader.readLine());
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (fI[i] < cI[j]) {
                        switchCountFootball++;
                    } else {
                        switchCountCricket++;
                    }
                }
            }
            System.out.println(switchCountCricket+switchCountFootball-1);
        }
    }
}