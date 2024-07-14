/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 24-09-2022
 *   Time: 22:09
 *   File: SHL.java
 */

import java.awt.*;
import java.util.*;
import java.util.List;

public class SHL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int n = scanner.nextInt();
        int apple1 = scanner.nextInt();
        int price1 = scanner.nextInt();
        int apple2 = scanner.nextInt();
        int price2 = scanner.nextInt();

        int result = minPrice(n, apple1, price1, apple2, price2);
        System.out.println(result);*/
        /*int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
            int result = busRemaining(arr);
            System.out.println(result);
        }*/
    /*static int minPrice(int n, int apple1, int price1, int apple2, int price2) {
        int ans = 0;
        int min=Integer.MAX_VALUE;
        for(int i = 0; apple1 * i <= n; i++) {
            int rem = n - i * apple1;
            if(rem % apple2 == 0) {
                int cost = price1 * i + price2 * (rem / apple2);
                min = (cost < min || min == -1) ? cost:min;
            }
        }
        if(min!=-1) {
            ans = min;
        }
        return ans;
    }*/

    /*static int busRemaining(int[][] busStation) {
        int answer = 0;
        int N = busStation.length;

        List<List<Integer>> graph = new ArrayList();
        for (int i = 0; i < N; ++i) {
            Arrays.sort(busStation[i]);
            graph.add(new ArrayList());
        }
        Set<Integer> seen = new HashSet();
        Set<Integer> targets = new HashSet();
        Queue<Point> queue = new ArrayDeque();*9/

        // Build the graph.  Two buses are connected if
        // they share at least one bus stop.
        /*for (int i = 0; i < N; ++i)
            for (int j = i + 1; j < N; ++j)
                if (intersect(busStation[i], busStation[j])) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }

        for (int i = 0; i < N; ++i) {
            if (Arrays.binarySearch(busStation[i], 0) >= 0) {
                seen.add(i);
                queue.offer(new Point(i, 0));
            }
            if (Arrays.binarySearch(busStation[i], N) >= 0)
                targets.add(i);
        }

        while (!queue.isEmpty()) {
            Point info = queue.poll();
            int node = info.x, depth = info.y;
            if (targets.contains(node)) return depth + 1;
            for (Integer nei : graph.get(node)) {
                if (!seen.contains(nei)) {
                    seen.add(nei);
                    queue.offer(new Point(nei, depth + 1));
                }
            }
        }

        return answer+1;
    }

    public static boolean intersect(int[] A, int[] B) {
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) return true;
            if (A[i] < B[j]) i++;
            else j++;
        }
        return false;
    }*/
        /*int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int result = noOfElements(arr, num);
        System.out.println(result);
    }

    public static int noOfElements(int[] element, int num) {
        int ans = 0;
        Arrays.sort(element);
        for (int j : element) {
            if (j < num) {
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }*/

        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[2];
        for (int i = 0; i < 2; i++) {
            arr3[i] = scanner.nextInt();
        }

        int[][] employeeQuit = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                employeeQuit[i][j] = scanner.nextInt();
            }
        }

        int[] result = orgRep(arr1, arr2, employeeQuit);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    static int[] orgRep(int[] effList, int[] idElist, int[][] empQuit) {
        int[] ans = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < effList.length; i++) {
            sum1 = sum1 + effList[i];
        }

        for (int i = 0; i < idElist.length; i++) {
            sum2 = sum2 + idElist[i];
        }
        int firedEmp = empQuit[0][0];
        int resignedEmp = 5;

        int fireedEmp2 = empQuit[1][0];
        int resignedEmp2 = 0;

        sum1 = sum1-firedEmp-resignedEmp;
        sum2 = sum2-fireedEmp2-resignedEmp2;
        ans[0] = sum1;
        ans[1] = sum2;
        return ans;
    }
}