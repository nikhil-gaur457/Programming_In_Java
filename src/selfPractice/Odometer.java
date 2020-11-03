/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 30-10-2020
 *   Time: 18:12
 *   File: Odometer.java
 */

package selfPractice;

import javax.swing.*;

class OdometerLoops {
    public static void main(String[] args) throws Exception {
        for (int thous = 0; thous < 10; thous++) {
            for (int hund = 0; hund < 10; hund++) {
                for (int tens = 0; tens < 10; tens++) {
                    for (int ones = 0; ones < 10; ones++) {
                        System.out.print(" " + thous + "" + hund + "" + tens +
                                "" + ones + "\r");
                        Thread.sleep(10);
                    }
                }
            }
        }

        System.out.println();
        JOptionPane.showConfirmDialog(
                null,
                "The Odometer reached to end limit!",
                "Odometer",
                JOptionPane.CLOSED_OPTION
        );
    }
}