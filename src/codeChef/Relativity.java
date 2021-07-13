/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 03-07-2021
 *   Time: 21:29
 *   File: Relativity.java
 */

package codeChef;

import java.util.Scanner;

public class Relativity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int g = scanner.nextInt();
            int c = scanner.nextInt();
            int height = (c*c)/(2*g); // from equation of relativity i.e, (v)^2 = 2gH.
            System.out.println(height);
        }
    }
}