/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 07-02-2022
 *   Time: 20:02
 *   File: HarryToHogwarts.java
 */

package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class HarryToHogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(keprekar(N));
    }

    public static int keprekarRec(int n, int prev, int cnt) {
        if (n == 0)
            return 0;
        prev = n;
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = n % 10;
            n/=10;
        }
        Arrays.sort(digits);
        int asc = 0;
        for (int i = 0; i < 4; i++) {
            asc = asc*10+digits[i];
        }

        //Arrays.sort(digits, digits+4, greater<int>());
        int desc = 0;
        for (int i = 0; i < 4; i++) {
            desc=desc*10+digits[i];
        }
        int diff = (desc-asc);
        if (diff == prev) {
            return cnt;
        }
        cnt++;
        return keprekarRec(diff, prev, cnt);
    }

    public static int keprekar(int n) {
        int prev = 0;
        int cnt = 0;
        return keprekarRec(n, prev, cnt);
    }
}