/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 26-12-2022
 *   Time: 19:06
 *   File: ReverseWord.java
 */

package selfPractice;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ans = "";
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if (i > s.length()) {
                break;
            }
            int j = i + 1;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            String subString = s.substring(i, j);
            if(ans.length() == 0) {
                ans = subString;
            } else {
                ans = subString + " " + ans;
            }
            i = j+1;
        }
        System.out.println(ans);
    }
}