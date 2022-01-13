/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 13-01-2022
 *   Time: 21:21
 *   File: LeetCodeProblemOne.java
 */

package collection.framework.map;

import java.util.HashMap;

public class LeetCodeProblemOne {
    public static void main(String[] args) {
        LeetCodeProblemOne leetCodeProblemOne = new LeetCodeProblemOne();
        int[] arr = {2, 11, 5, 10, 7, 8};
        int target = 9;
        leetCodeProblemOne.twoSum(arr, target);
    }

    public void twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = map.get(target-nums[i]);
            }
        }
        System.out.print("[" + result[0] + ", " + result[1] + "]");
    }
}