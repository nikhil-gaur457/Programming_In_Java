/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 11-11-2020
 *   Time: 18:51
 *   File: Lcm.java
 */

package selfPractice;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        int HCF = 0, LCM;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter both numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                HCF = i;
            }
        }
        LCM = (num1*num2)/HCF;
        System.out.println("L.C.M of both numbers is " + LCM);
        System.out.println("HCF of two numbers is " + HCF);
    }
}