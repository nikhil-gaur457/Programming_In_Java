/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 05-01-2022
 *   Time: 17:11
 *   File: PatternOfNumbers.java
 */

package selfPractice.patterns;

public class PatternOfNumbers {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}