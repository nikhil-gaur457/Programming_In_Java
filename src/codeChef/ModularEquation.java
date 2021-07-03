/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-05-2021
 *   Time: 18:55
 *   File: ModularEquation.java
 */

package codeChef;

import java.util.Scanner;

public class ModularEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            long N = scanner.nextLong();
            long M = scanner.nextLong();
            long count = 0;
            long[] arr = new long[(int) (N + 1)]; // all elements to 1
            for (long i = 1; i <= N; i++) {
                long a = (M % i); // question main logic(given)
                count = count + arr[(int) a]; // store in count variable and keep increasing for next loop
                for (long j = a; j <= N; j += i) { // take 'a' as array index and increment to 1
                    arr[(int) j]++;
                }
            }
            System.out.println(count);
        }
    }
}