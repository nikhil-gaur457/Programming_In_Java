/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 28-11-2023
 *   Time: 17:20
 *   File: TimeQuest.java
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeQuest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputTime = bufferedReader.readLine();
        TimeQuest.minMaxTime(inputTime);
        bufferedReader.close();
    }

    public static void minMaxTime(String inputTime) {
        int atIndex = inputTime.indexOf('@');
        char minTimeValue = '0';
        char maxTimeValue = '2';
        if (atIndex == 1 || atIndex == 4 || atIndex == 7) {
            maxTimeValue = '9';
        } else if (atIndex == 3 || atIndex == 6) {
            maxTimeValue = '5';
        }
        String minTime = inputTime.replace('@', minTimeValue);
        String maxTime = inputTime.replace('@', maxTimeValue);
        System.out.println("MIN " + minTime);
        System.out.println("MAX " + maxTime);
    }
}