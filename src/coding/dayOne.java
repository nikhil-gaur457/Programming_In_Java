/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-07-2022
 *   Time: 17:19
 *   File: dayOne.java
 */

package coding;

import java.util.Scanner;

public class dayOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int x = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                x ^= arr[i];
            }
            for (int i = 0; i < n; i++) {
                if ((x ^ arr[i]) == arr[i]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}