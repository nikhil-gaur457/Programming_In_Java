/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-01-2022
 *   Time: 17:13
 *   File: SimpleAndReverseAsterisk.java
 */

package selfPractice.patterns;

class HalfDiamondStarPattern {
    public static void main(String[] args) {
        int n = 5;
        int columns = 1;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            if (i < n) {
                columns++;
            } else {
                columns--;
            }
            System.out.println();
        }
    }
}