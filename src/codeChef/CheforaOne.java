/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 11-07-2021
 *   Time: 21:47
 *   File: CheforaOne.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CheforaOne {
    public static void main(String[] args) throws java.lang.Exception {
        inputReader ir = new inputReader();
        long Q = ir.nextLong();
        while (Q-- > 0) {
            long num = 0;
            long sol = 0;
            long L = ir.nextLong();
            long R = ir.nextLong();
            long temp = 0;
            int numDigits = countDigit(L);
            if ((numDigits & 1) != 0) {
                num = calChefora(L);
                for (long i = L + 1; i <= R; i++) {
                    temp = temp + calChefora(i);
                }
                sol = modPow(num, temp);
                System.out.println(sol);
            }
        }
    }

    static int countDigit(long n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    static long calChefora(long num) {
        String temp = Long.toString(num);
        if (num % 10 == num) return num;
        num = num / 10;
        long reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        temp = temp + reversed;
        long sol = Long.parseLong(temp);
        return sol;
    }

    static long modPow(long var, long num) {
        long m = 1;
        long M = 1000000007;
        while (num > 0) {
            m = (m * var) % M;
            --num;
        }
        return m;
    }

    public static class inputReader {
        BufferedReader br;
        StringTokenizer st;
        public inputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}