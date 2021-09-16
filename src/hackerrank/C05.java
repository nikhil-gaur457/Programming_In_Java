/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-09-2021
 *   Time: 12:47
 *   File: C05.java
 */

package hackerrank;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        if (numberOfMonth >= 1 && numberOfMonth <= 2) {
            System.out.println("Season:Winter");
        }
        if (numberOfMonth >= 3 && numberOfMonth <= 5) {
            System.out.println("Season:Spring");
        }
        if (numberOfMonth >= 6 && numberOfMonth <= 8) {
            System.out.println("Season:Summer");
        }
        if (numberOfMonth >= 9 && numberOfMonth <= 11) {
            System.out.println("Season:Autumn");
        }
        if (numberOfMonth == 12) {
            System.out.println("Season:Winter");
        } if (numberOfMonth > 12) {
            System.out.println("Invalid month");
        }
    }
}