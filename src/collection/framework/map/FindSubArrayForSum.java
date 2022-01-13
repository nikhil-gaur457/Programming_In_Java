/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 13-01-2022
 *   Time: 20:41
 *   File: FindSubArrayForSum.java
 */

package collection.framework.map;

import java.util.HashMap;
import java.util.Scanner;

public class FindSubArrayForSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int sizeOfArray = scanner.nextInt();
        System.out.print("Enter the array : ");
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter sum : ");
        int sum = scanner.nextInt();
        FindSubArrayForSum findSubArrayForSum = new FindSubArrayForSum(); // Object for implementing subArraySum method.
        findSubArrayForSum.subArraySum(arr, sum);
    }

    // Method for finding sub array for a given sum from given array.
    public void subArraySum(int[] arr, int sum) {
        int currentSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            // If sub array founds at front of array.
            if (currentSum - sum == 0) {
                end = i;
                break;
            }
            // if sub array is present at any position.
            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currentSum, i); // store that value in map.
        }
        if (end == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(start + ", " + end);
        }
    }
}