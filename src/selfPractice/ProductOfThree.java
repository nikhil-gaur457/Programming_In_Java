/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 06-11-2020
 *   Time: 20:55
 *   File: ProductOfThree.java
 */

package selfPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ProductOfThree {
    public static void main(String[] args) {
        System.out.println("Enter three number ->");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int result = number1*number2*number3;
        System.out.println("Result = " + result);
    }
}