/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 21-05-2022
 *   Time: 21:50
 *   File: CoinChange.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        Arrays.sort(arr);
        for (int i = n-1; i <= 0; i--) {
            if (arr[i] == arr[n - 2]) {
                if(arr[i] < arr[i+1] && target >= arr[i+1]) {
                    target = target - arr[i+1];
                    ans++;
                }
            }

            if (arr[i] <= target) {
                target = target - arr[i];
                ans++;
            }
        }
        System.out.println(ans);

    }
}