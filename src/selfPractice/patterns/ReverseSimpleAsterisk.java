/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-01-2022
 *   Time: 17:05
 *   File: ReverseSimpleAsterisk.java
 */

package selfPractice.patterns;

class InvertedRightTriangleStarPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}