/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 07-02-2022
 *   Time: 18:51
 *   File: PositiveIntegerPair.java
 */

package hackerrank;

import java.util.Scanner;

public class PositiveIntegerPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int X = scanner.nextInt();
        int resI = 0, resJ = 0;
        for (int i = 0; i <= P; i++) {
            for (int j = 0; j <= P; j++) {
                if ((i+j) == P && (i ^ j) == X) {
                    resI = i;
                    resJ = j;
                }
            }
        }
        System.out.print(resJ + " " + resI);
    }
}