/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 25-07-2022
 *   Time: 18:04
 *   File: Infosys1.java
 */

import java.util.Scanner;

public class Infosys1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int e = scanner.nextInt();
        int[] monster = new int[n];
        int[] bonus = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            monster[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bonus[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-i-1; j++) {
                if (monster[j] > monster[j+1]) {
                    int temp1 = monster[j];
                    monster[j] = monster[j+1];
                    monster[j+1] = temp1;

                    int temp2 = bonus[j];
                    bonus[j] = bonus[j+1];
                    bonus[j+1] = temp2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (e >= monster[i]) {
                e = e + bonus[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}