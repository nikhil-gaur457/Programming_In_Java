/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-01-2023
 *   Time: 17:38
 *   File: ReverseN.java
 */

public class ReverseN {
    public static void main(String[] args) {
        String name = "Nikhil";
        String ans = "";
        char c;
        for(int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            ans = c + ans;
        }
        System.out.println(ans);
    }
}