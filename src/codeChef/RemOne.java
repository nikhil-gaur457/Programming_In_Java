/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 29-08-2021
 *   Time: 17:07
 *   File: RemOne.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(bf.readLine());
            int[] arrA = new int[N];
            int[] arrB = new int[N-1];
            for (int i = 0; i < N; i++) {
                arrA[i] = Integer.parseInt(bf.readLine());
            }
            for (int i = 0; i < N-1; i++) {
                arrB[i] = Integer.parseInt(bf.readLine());
            }
            Arrays.sort(arrA);
            Arrays.sort(arrB);
            if (N == 2) {
                if (arrB[0] > arrA[1]) {
                    System.out.println(arrB[0]-arrA[1]);
                } else {
                    System.out.println(arrB[0]-arrA[0]);
                }
            } else {
                if (arrB[0]-arrA[1] == arrB[N-2]-arrA[N-1]){
                    System.out.println(arrB[0]-arrA[1]);
                } else {
                    System.out.println(arrB[0]-arrA[0]);
                }
            }
        }
    }
}