/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-09-2021
 *   Time: 12:39
 *   File: C02.java
 */

package hackerrank;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPizzas = scanner.nextInt();
        int numberOfPuffs = scanner.nextInt();
        int numberOfCooldrinks = scanner.nextInt();
        int totalPrice = (numberOfPizzas * 100) + (numberOfPuffs * 20) + (numberOfCooldrinks * 10);
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + numberOfPizzas);
        System.out.println("No of puffs:" + numberOfPuffs);
        System.out.println("No of cooldrinks:" + numberOfCooldrinks);
        System.out.println("Total price=" + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");
    }
}