/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 27-08-2021
 *   Time: 12:10
 *   File: DigitToWord.java
 */

package selfPractice;

import java.util.Scanner;

public class digitsToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Zero");
        } else {
            String words = "";
            String[] unitPlace = {"zero", "one", "two", "three", "four", "five", "six",
                    "seven", "eight", "nine", "ten", "eleven", "twelve",
                    "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                    "eighteen", "nineteen"};
            String[] tensPlace = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                    "sixty", "seventy", "eighty", "ninety"};

            if ((number / 1000) > 0) {
                words = words + unitPlace[(number / 1000)] + "-" + "Thousand" + " ";
                number %= 1000;
            }
            if ((number / 100) > 0) {
                words = words + unitPlace[(number / 100)] + "-" + "Hundred" + " ";
                number %= 100;
            }
            if (number > 0) {
                if (number < 20) {
                    words = words + unitPlace[number];
                } else {
                    words = words + tensPlace[number / 10];
                    if ((number % 10) > 0) {
                        words = words + "-" + unitPlace[number % 10];
                    }
                }
            }
            System.out.println(words);
        }
    }
}