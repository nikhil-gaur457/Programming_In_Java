/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-09-2021
 *   Time: 20:59
 *   File: MakeItDivisible.java
 */

package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Make_it_Divisible {

    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int T = fr.nextInt();
        while (T-- > 0) {
            int N = fr.nextInt();
            if (N == 1) {
                result.append("3\n");
            } else if (N == 2) {
                result.append("33\n");
            } else {
                StringBuilder temp = new StringBuilder("3");
                for (int i = 1; i <= N - 2; i++) {
                    temp.append("0");
                }
                temp.append("3\n");
                result.append(temp.toString());
            }
        }
        System.out.print(result);
    }

    static class FastReader {
        InputStreamReader ir;
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            ir = new InputStreamReader(System.in);
            br = new BufferedReader(ir);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}