/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-09-2021
 *   Time: 11:07
 *   File: TwoDArrayTest.java
 */

package hackerrank;

import java.util.Scanner;

public class TwoDArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < M; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                for (int j = N-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}