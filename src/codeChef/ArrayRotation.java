/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 30-04-2021
 *   Time: 21:49
 *   File: ArrayRotation.java
 */

package codeChef;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrA = new int[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt();
        int[] arrQ = new int[Q];
        for (int i = 0; i < Q; i++) {
            arrQ[i] = scanner.nextInt();
        }
        
    }
}