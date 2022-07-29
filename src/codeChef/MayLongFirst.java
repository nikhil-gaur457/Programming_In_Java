/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 22-05-2022
 *   Time: 18:38
 *   File: MayLongFirst.java
 */

package codeChef;

import java.util.HashMap;
import java.util.Scanner;

public class MayLongFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n =scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int len = arr[i];
                int pairs = Math.max(i - len + 1, 0);
                if (map.containsKey(arr[i]))
                    if (map.get(arr[i]) >= pairs) {
                        pairs = map.get(arr[i]) + 1;
                    }

                int subSequence;
                if (pairs + len - 1 >= n)
                    subSequence = n - 1;
                else
                    subSequence = pairs + len - 1;
                if (subSequence-pairs+1 != len || pairs > subSequence) {
                    continue;
                }

                count += Math.min((i-pairs+1), (n-subSequence));
                map.put(arr[i], i);
            }
            System.out.println(count);
        }


        /*while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int forFirst = x*10;
            int forRemain = y*90;
            System.out.println(forFirst+forRemain);
        }*/

        // Second Question
        /*        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int p3 = scanner.nextInt();
        int p4 = scanner.nextInt();
        int count = 0;
        if(p1 >= 10) {
            count++;
        }
        if(p2 >= 10) {
            count++;
        }
        if(p3 >= 10) {
            count++;
        }
        if(p4 >= 10) {
            count++;
        }
        System.out.println(count);*/

        // third question
        /*        while(t-- > 0) {
            int n = scanner.nextInt();
            int nA = scanner.nextInt();
            int nB = scanner.nextInt();
            int nC = scanner.nextInt();
            int nD = scanner.nextInt();

            int ans = Math.max(nA, Math.max(nB, Math.max(nC,nD)));
            System.out.println(ans);
        }
*/

        // Fourth Question
        /*while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = n-1; i > 0; i--) {
                if(arr[i] != 0) {
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }*/

        // Fifth Question
        /*
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String a = scanner.nextLine();
            int count = 0;
            for(int i = 0; i < n/2; i++) {
                if(a.charAt(i) != a.charAt(n-1-i)) {
                    count++;
                }
            }
            System.out.println((count+1)/2);
        }
         */

        // Sixth Question
        /*
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[32];
            for (int i = 0; i < n; i++) {
                int count = 0;
                int a = scanner.nextInt();
                while (true) {
                    if (a == 0) break;
                    if(arr[count] == 0) {
                        arr[count] = a%2;
                    }
                    a = a/2;
                    count++;
                }
            }
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                ans = ans + arr[i];
            }
            System.out.println(ans);
        }
         */
    }
}