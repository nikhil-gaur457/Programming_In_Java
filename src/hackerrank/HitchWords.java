/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 07-02-2022
 *   Time: 19:24
 *   File: HitchWords.java
 */

package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class HitchWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        boolean ans = ans(arr, N);
        System.out.println(ans ? "True" : "False");
    }

    private static boolean ans(String[] arr, int n) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            arrayList.add(new ArrayList<>());
        }
        boolean[] check = new boolean[26];
        int[] in = new int[26];
        int[] out = new int[26];
        for (String s : arr) {
            int first = s.charAt(0) - 'a';
            int last = s.charAt(s.length() - 1) - 'a';
            check[first] = true;
            check[last] = true;
            in[first]++;
            out[last]++;
            arrayList.get(first).add(last);
        }

        for (int i = 0; i < out.length; i++) {
            if (in[i] != out[i]) return false;
        }
        return isLastWordMatches(arrayList, check, arr[0].charAt(0) - 'a');
    }

    private static boolean isLastWordMatches(ArrayList<ArrayList<Integer>> arrayList, boolean[] mark, int src) {
        boolean[] check = new boolean[26];
        checkForFirst(arrayList, check, src);
        for (int i = 0; i < check.length; i++) {
            if (mark[i] && !check[i]) {
                return false;
            }
        }
        return true;
    }

    private static void checkForFirst(ArrayList<ArrayList<Integer>> arrayList, boolean[] check, int src) {
        check[src] = true;
        ArrayList<Integer> newArr = arrayList.get(src);
        for (int nbr : newArr) {
            if (!check[nbr]) {
                checkForFirst(arrayList, check, nbr);
            }
        }
    }
}