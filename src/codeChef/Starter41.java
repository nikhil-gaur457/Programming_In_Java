/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 01-06-2022
 *   Time: 21:52
 *   File: Starter41.java
 */

package codeChef;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Starter41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String time = scanner.next();
            int minutes = scanner.nextInt();
            int hr = Integer.parseInt(time.substring(0,2));
            int min = Integer.parseInt(time.substring(3));
            int res = 0;
            HashSet<String> set = new HashSet<>();
            while(true) {
                min = min + minutes;
                if (min >= 60) {
                    int div = min/60;
                    int rem = min % 60;
                    min = rem;
                    hr = hr + div;
                }
                String zone = hr + "#" + min;
                if (set.contains(zone)) {
                    break;
                }
                hr = hr % 24;
                set.add(zone);
                if (isPalindrome(hr, min)) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }

    static boolean isPalindrome(int a, int b) {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        int s = 0;
        if(s1.length() == 1) {
            s1 = "0" + s1;
        }
        if(s2.length() == 1) {
            s2 = "0" + s2;
        }
        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();
        return sb.toString().equals(s1);
    }
}


//
//    int n = 8;
//    String[] arr = new String[n];
//            for (int i = 0; i < n; i++) {
//        arr[i] = scanner.next();
//        }
//        for (int i = 1; i < arr.length-1; i++) {
//        for (int j = 1; j < arr[i].length()-1; j++) {
//        if (arr[i-1].charAt(j-1) == '#' && arr[i+1].charAt(j-1) == '#' &&
//        arr[i+1].charAt(j+1) == '#' && arr[i-1].charAt(j+1) == '#') {
//        System.out.println((i+1) + " " + (j+1));
//        }
//        }
//        }
//
//    int n = scanner.nextInt();
//    int[] arr = new int[n];
//    HashMap<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i < n; i++) {
//        arr[i] = scanner.nextInt();
//        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//
//        int ans = 0;
//        for (Integer i: map.keySet()
//        ) {
//        ans = ans + (map.get(i)-1);
//        }
//        if (ans % 2 == 0) {
//        System.out.println(arr.length-ans);
//        } else {
//        System.out.println(arr.length-(ans+1));
//        }


//
//import java.util.*;
//class CodeForces {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//            int d = scanner.nextInt();
//            if(a < b && a < c && a < d) {
//                System.out.println("3");
//            } else if(a < b && a < c) {
//                System.out.println("2");
//            } else if(a < c && a < d) {
//                System.out.println("2");
//            } else if(a < b && a < d) {
//                System.out.println("2");
//            } else if(a < b || a < c || a < d) {
//                System.out.println("1");
//            } else {
//                System.out.println("0");
//            }
//        }
//    }
//}
//


//    int x = scanner.nextInt();
//    int y = scanner.nextInt();
//    int z = scanner.nextInt();
//
//    int total = x*5 + y*10;
//    int buy = total / z;
//            System.out.println(buy);
//}


//
//    int pa = scanner.nextInt();
//    int pb = scanner.nextInt();
//    int qa = scanner.nextInt();
//    int qb = scanner.nextInt();
//    int forA = Math.max(pa, pb);
//    int forB = Math.max(qa, qb);
//
//            if (forA < forB) {
//        System.out.println("P");
//        } else if(forA == forB){
//        System.out.println("TIE");
//        } else {
//        System.out.println("Q");
//        }