/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 19-02-2022
 *   Time: 23:03
 *   File: LeetcodeProblem704.java
 */

import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeProblem704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int targetValue = scanner.nextInt();
        Arrays.sort(arr);
        int ans = search(arr, targetValue);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        if (start >= end)
            return -1;

        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else {
            if (target < nums[mid]) {
                return binarySearch(nums, target, start, mid);
            } else {
                return binarySearch(nums, target, mid + 1, end);
            }
        }
    }
}