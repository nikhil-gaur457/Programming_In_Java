/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-04-2021
 *   Time: 16:10
 *   File: ChefOnIsland.java
 */

package codeChef;

import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int xR = scanner.nextInt();
            int yR = scanner.nextInt();
            int D = scanner.nextInt();
            int minFood = x/xR;
            int minWater = y/yR;
            int remDays = Math.min(minFood, minWater);
            if (remDays >= D) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}