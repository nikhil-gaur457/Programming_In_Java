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
        System.out.print("Enter the size of array : ");
        int sizeOfArray = scanner.nextInt();
        int[] arr = new int[sizeOfArray];
        System.out.println("Enter the array elements");
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = maxSumOfSubArray(arr, sizeOfArray);
        System.out.println("Maximum contiguous sum is : " + ans);
    }

    public static int maxSumOfSubArray(int[] a, int size) {
        int max = a[0];
        int currentMax = a[0];
        for (int i = 1; i < size; i++) {
            currentMax = Math.max(a[i], currentMax + a[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }
}

