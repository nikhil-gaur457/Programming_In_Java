/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 11-07-2021
 *   Time: 21:34
 *   File: Chefora.java
 */

package codeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chefora {
    Scanner scanner = new Scanner(System.in);
    StringTokenizer st;

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        ArrayList<Long> arrL = new ArrayList();
        ArrayList<Long> arrR = new ArrayList();
        ArrayList<Long> chefora = new ArrayList();

        for (int i = 0; i < Q; i++) {
            long L = scanner.nextLong();
            long R = scanner.nextLong();
            arrL.add(L);
            arrR.add(R);
        }

        for (long i = Collections.min(arrL); i <= Collections.max(arrR); i++) {
            long temp = 0;
            temp = temp + calChefora(i);
            chefora.add(temp);
        }
        for (int i = 0; i < Q; i++) {
            long num = 0;
            long sol = 0;
            int numDigits = countDigit(arrL.get(i));

            if ((numDigits & 1) != 0) {
                long temp = 0;
                num = calChefora(arrL.get(i));
                int indexL = chefora.indexOf(num);
                indexL += 1;
                long diff = arrR.get(i) - arrL.get(i);

                while (diff-- > 0) {
                    temp = temp + chefora.get(indexL);
                    indexL++;
                }

                sol = modPow(num, temp);
            }
            System.out.println(sol);
        }
    }

    static int countDigit(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    static long calChefora(long num) {
        if (num % 10 == num) return num;
        String input = String.valueOf(num);
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        StringBuilder tSol = new StringBuilder(input);
        for (int i = 1; i < input1.length(); i++) {
            tSol.append(input1.charAt(i));
        }
        return Long.parseLong(tSol.toString());

    }

    static long modPow(long x, long y) {
        long M = 1000000007;
        long res = 1;

        x = x % M;

        if (x == 0)
            return 0;

        while (y > 0) {

            if ((y & 1) != 0)
                res = (res * x) % M;

            y = y >> 1; // y = y/2
            x = (x * x) % M;
        }
        return res;
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(scanner.next());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return st.nextToken();
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

}