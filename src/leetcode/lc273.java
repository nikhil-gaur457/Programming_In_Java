/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 08-08-2024
 *   Time: 00:15
 *   File: lc273.java
 */

package leetcode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lc273 {
    private static final String[] onesPlace = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
            " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
    private static final String[] tensPlace = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("zero");
            return;
        }
        String result = convertNumberIntoWord(number);
        System.out.println("number in words : " + result);
    }

    public static String convertNumberIntoWord(int number) {
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        String numberString = df.format(number);

        // XXXnnnnnnnnn, nnnXXXnnnnnn, nnnnnnXXXnnn, nnnnnnnnnXXX
        int billions = Integer.parseInt(numberString.substring(0, 3));
        int millions = Integer.parseInt(numberString.substring(3, 6));
        int hundredThousands = Integer.parseInt(numberString.substring(6, 9));
        int thousands = Integer.parseInt(numberString.substring(9, 12));

        String inBillions, inMillions, inHundredThousands, inThousand;
        if (billions == 0) {
            inBillions = "";
        } else {
            inBillions = convertLessThanOneThousand(billions) + " Billion";
        }
        String result = inBillions;

        if (millions == 0) {
            inMillions = "";
        } else {
            inMillions = convertLessThanOneThousand(millions) + " Million";
        }
        result = result + inMillions;

        inHundredThousands = switch (hundredThousands) {
            case 0 -> "";
            case 1 -> "One Thousand";
            default -> convertLessThanOneThousand(hundredThousands) + " Thousand";
        };
        result = result + inHundredThousands;

        inThousand = convertLessThanOneThousand(thousands);
        result = result + inThousand;

        return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
    }


    private static String convertLessThanOneThousand(int number) {
        String wordOfNumber;
        if (number % 100 < 20) {
            wordOfNumber = onesPlace[number % 100];
            number /= 100;
        } else {
            wordOfNumber = onesPlace[number % 10];
            number /= 10;

            wordOfNumber = tensPlace[number % 10] + wordOfNumber;
            number /= 10;
        }
        if (number == 0) {
            return wordOfNumber;
        }
        return onesPlace[number] + " Hundred" + wordOfNumber;
    }
}