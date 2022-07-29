/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 21-05-2022
 *   Time: 07:55
 *   File: JuspayROne.java
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JuspayROne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int noBlock = sc.nextInt();
            int[] arr = new int[noBlock];
            for (int j = 0; j < noBlock; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(solution(arr, arr.length, arr[0], arr[arr.length-1]));
        }
        sc.close();
    }

    public static int solution(int[] nodes, int N, int node1, int node2) {
        int[] visited = new int [N];
        int cnt1 = 0; //used for counting length of path from node1 to node2
        int cnt2 = 0; //used for counting length of path from node2 to node1
        int mark = node1; //storing as a marker needed later for detecting end of search

        if(node1 == node2) return node2;
        for(int i = 0; i < N; i++){
            visited[i] = 0;
        }

        while((nodes[node1] != node1) && (nodes[node1] != -1) && (visited[node1] == 0) && (node1 != node2)){
            visited[node1]++;
            node1 = nodes[node1];
            cnt1++;
        }

        visited[node1]++;
        while((nodes[node2] != node2) && (nodes[node2] != -1) && (visited[node2] != 2) && (node1 != node2)){
            visited[node2]++;
            node2 = nodes[node2];
            cnt2++;
        }
        if(node1 != node2) return -1;
        if ((nodes[node1] == -1) && (visited[node2] == 1)) return -1;
        if(nodes[node2] == -1) return -1;
        if(cnt1 > cnt2)
            return node2;
        else
            return mark;
    }
}




/*
/*ArrayList<Integer> sum = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> connected = new ArrayList<>();
            int j = i;
            int tempSum = 0;
            if (arr[j] < n && arr[j] != i && arr[j] != -1) {
                do {
                    connected.add(j);
                    tempSum += j;
                    j = arr[j];
                    if (arr[j] == i) {
                        tempSum += j;
                        break;
                    }
                } while (arr[j] < n && arr[j] != i && arr[j] != -1 && !connected.contains(j));
            }
            if (i == arr[j])
                sum.add(tempSum);
        }
        if (sum.isEmpty())
            return -1;
        return Collections.max(sum);*/


/*        int n = array.length;
        int[] count = new int[n];
        Arrays.fill(count, 0);
        IntStream.range(0, n).filter(i -> array[i] != -1).forEach(i -> count[array[i]] += i);
        int maxWeightHarsh = 0, nodeNumber = -1, i = 0;
        while (i < n) {
            if(count[i] > maxWeightHarsh) {
                maxWeightHarsh = count[i];
                nodeNumber = i;
            }
            i++;
        }
        return nodeNumber;*/
