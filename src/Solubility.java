/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-05-2021
 *   Time: 15:20
 *   File: Solubility.java
 */

import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int X = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int solubilityInHundred = A + (100 - X) * B;
            int sugarAmount = solubilityInHundred * 10;
            System.out.println(sugarAmount);
        }
    }
}