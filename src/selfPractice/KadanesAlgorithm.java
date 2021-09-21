/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 21-09-2021
 *   Time: 00:48
 *   File: KadanesAlgorithm.java
 */

package selfPractice;

import java.util.Arrays;
import java.util.Scanner;

class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int subArraySum = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            subArraySum = subArraySum + arr[i];
        }
        if (subArraySum < 0) {
            subArraySum = arr[sizeOfArray-1];
        }
        System.out.println(subArraySum);
    }
}
