/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 26-03-2024
 *   Time: 22:16
 *   File: CodeForcesQ1.java
 */

import java.util.HashSet;
import java.util.Set;

public class CodeForcesQ1 {
    public static void main(String[] args) {
        int[] arr = {877914575, 24979445, 623690081, 262703497, 24979445, 1822804784, 1430302156, 1161735902, 923078537, 1189330739};
        int k = 158260522;
        int result = cSum(arr, k);
        System.out.println(result);
    }

    public static int cSum(int[] arr, int k) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        for (int i = 0; i <= k; i++) {
            if (!set.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }
}