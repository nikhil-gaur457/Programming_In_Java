/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-07-2023
 *   Time: 14:00
 *   File: Abc.java
 */

package selfPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] matrix = new int[r][c];
        int sum = 0;
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++){
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j] * matrix[i][j];
            }
        }
        System.out.println(Math.sqrt(sum));
    }






    public static char firstNonRepeatingChar(String string) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : string.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        for (char c : string.toCharArray()) {
            if (charFreq.get(c) == 1) {
                return c;
            }
        }
        throw new IllegalArgumentException("No non-repeating character found in the string");
    }
}