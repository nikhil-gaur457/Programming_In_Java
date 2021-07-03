/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-04-2021
 *   Time: 23:41
 *   File: ChocolateMonger.java
 */

package codeChef;

import java.util.Scanner;

public class ChocolateMonger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T -- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int countSame = 0;
            int countDiff = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                if (arr[i] == arr[i+1]) {
                    countSame++;
                } else {
                    countDiff++;
                }
            }
            int totalElements = countSame+countDiff;
            System.out.println(totalElements);
        }
    }
}