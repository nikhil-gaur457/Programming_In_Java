/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-07-2022
 *   Time: 17:33
 *   File: Main.java
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int x = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                x ^= arr[j];
            }
            for (int j = 0; j < n; j++) {
                if ((x ^ arr[j]) == arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}