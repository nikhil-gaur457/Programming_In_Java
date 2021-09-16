/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-09-2021
 *   Time: 12:05
 *   File: C01.java
 */

package hackerrank;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantityOfDiesel = scanner.nextDouble();
        double distanceCoveredTillTankGoesDry = scanner.nextDouble();
        double fuelForHundred = (quantityOfDiesel/distanceCoveredTillTankGoesDry) * 100;
        System.out.println("Liters/100KM");
        System.out.printf("%.2f%n", fuelForHundred);
        double inMiles = (distanceCoveredTillTankGoesDry * 0.6214);
        double inGallons = (quantityOfDiesel * 0.2642);
        double ans = inMiles / inGallons;
        System.out.println("Miles/gallons");
        System.out.printf("%.2f%n", ans);
    }
}