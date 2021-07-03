/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-05-2021
 *   Time: 13:09
 *   File: StopTheSpread.java
 */

package hackerrank;

import java.util.Scanner;

public class StopTheSpread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            int d = scanner.nextInt();
            int[] standingPosition = new int[N];
            for (int i = 0; i < N; i++) {
                standingPosition[i] = scanner.nextInt();
            }
            int minimumInfected = 1;
            int maximumInfected = 0;
            for (int i = 0; i < N; i++) {
                if (standingPosition[i+1] - standingPosition[i] <= d) {
                    minimumInfected++;
                    break;
                } else if (standingPosition[N-1-i] - standingPosition[N-2-i] <= d) {
                    minimumInfected++;
                    break;
                }
            }
            maximumInfected = minimumInfected+1;
            System.out.println(minimumInfected + ", " + maximumInfected);
        }
    }
}