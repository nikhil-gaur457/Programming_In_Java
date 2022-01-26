/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 19-01-2022
 *   Time: 18:45
 *   File: LeetCodeProblemThree.java
 */

package collection.framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCodeProblemThree {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            if(map.containsKey(rightChar)) {
                start = Math.max(start, map.get(rightChar) + 1);
            }
            map.put(rightChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        LeetCodeProblemThree obj = new LeetCodeProblemThree();
        System.out.println(obj.lengthOfLongestSubstring(s));;
    }
}