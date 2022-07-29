/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-07-2022
 *   Time: 20:12
 *   File: theThirdNumber.java
 */

package coding;

import java.util.Scanner;

public class theThirdNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n/2; j++) {
                    for (int k = 0; k < n/2; k++) {
                        if((i ^ j) + (j ^ k) + (i ^ k) == n) {
                            System.out.println(i + " " + j + " " + k);
                            break;
                        }
                    }
                }
            }
            if(n == 1) {
                System.out.println("-1");
            }
        }
    }
}