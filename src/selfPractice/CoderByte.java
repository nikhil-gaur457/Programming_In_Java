/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-01-2023
 *   Time: 22:21
 *   File: CoderByte.java
 */

package selfPractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class CoderByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayChallenge(arr);

    }

    public static void ArrayChallenge(int[] arr) {
        System.out.print("-1 ");
        for (int i = 1; i < arr.length; i++) {
            int j;
            for(j = i-1; j >= 0; j--) {
                if (arr[j] <= arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if(j == -1) {
                System.out.print("-1 ");
            }
        }
    }
}