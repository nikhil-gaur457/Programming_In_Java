/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 12-07-2021
 *   Time: 13:28
 *   File: ChefOra.java
 */

package selfPractice;

import java.util.Scanner;

public class ChefOra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100001];
        int[] preArray = new int[100001];
        for (int i = 1; i < 100001; i++) {
            a[i] = chefOra(i);
            preArray[i] = preArray[i - 1] + a[i];
        }
        int T = scanner.nextInt();
        while (T-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int diff = preArray[r] - preArray[l];
            System.out.println(power(a[l], diff));
        }
    }

    public static int chefOra(int number) {
        int chefNum = number;
        int returnNumber;
        if (number < 10) {
            returnNumber = chefNum;
        } else {
            number = number / 10;
            while (number != 0) {
                chefNum = chefNum * 10 + number % 10;
                number = number / 10;
            }
            returnNumber = chefNum;
        }
        return returnNumber;
    }

    public static int power(int base, int power) {
        int result = 1;
        while (power != 0) {
            if (power % 2 == 0) {
                base = ((base % 1000000007) * (base % 1000000007)) % 1000000007;
                power = Math.floorDiv(power, 2);
            } else {
                result = ((result % 1000000007) * (base % 1000000007)) % 1000000007;
                power = power - 1;
            }
        }
        return result;
    }
}