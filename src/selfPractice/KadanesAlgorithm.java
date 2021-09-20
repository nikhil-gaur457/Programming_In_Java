/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 21-09-2021
 *   Time: 00:48
 *   File: KadanesAlgorithm.java
 */

package selfPractice;

import java.util.Scanner;

class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }
        int sumOfNegatives = 0;
        int sumOfPositives = 0;
        int subArraySum = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] < 0) {
                sumOfNegatives = sumOfNegatives + arr[i];
            }
        }
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] >= 0) {
                sumOfPositives = sumOfPositives + arr[i];
            }
        }
        subArraySum = sumOfPositives - sumOfNegatives;
        System.out.println(subArraySum);
        if (subArraySum <= -1) {
            subArraySum = arr[sizeOfArray];
            System.out.println(subArraySum);
        }
    }
}
