/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 04-07-2021
 *   Time: 20:46
 *   File: OptimalDenomination.java
 */

package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class OptimalDenomination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long T = scanner.nextLong();
        while (T-- > 0) {
            long N = scanner.nextLong();
            long[] employees = new long[(int) N];
            for (long i = 0; i < N; i++) {
                employees[(int) i] = scanner.nextInt();
            }
            Arrays.sort(employees);
            long minValueOfEmployee = employees[0];
            long maxValueOfEmployee = employees[(int) (N - 1)];
            int num = 0;
            for (long i = 0; i < N; i++) {
                if (employees[(int) i] == maxValueOfEmployee) {
                    employees[(int) i] = minValueOfEmployee;
                    break;
                }
            }
            for (long i = 0; i < N; i++) {
                num = (int) (num + (employees[(int) i] / minValueOfEmployee));
            }
            System.out.println(num);
        }
    }
}