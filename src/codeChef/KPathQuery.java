/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-07-2021
 *   Time: 17:30
 *   File: KPathQuery.java
 */

package codeChef;

import java.util.*;

public class KPathQuery {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            Map<Integer, Set<Integer>> tree = new HashMap<>();
            for (int i = 1; i < N; i++) addPathForQuery(tree, scanner.nextInt(), scanner.nextInt());

            int[] levelOfTree = new int[N + 1];
            int[] parentOfTree = new int[N + 1];
            preProcess(tree, levelOfTree, parentOfTree);

            int Q = scanner.nextInt();
            int[] visitedPaths = new int[N + 1];
            for (int i = 1; i <= Q; i++) {
                int K = scanner.nextInt();
                int[] kPathQuery = new int[K];
                int maxDepthOfTree = 0;
                int nodeWithMaxDepthOfTree = -1;
                for (int j = 0; j < K; j++) {
                    kPathQuery[j] = scanner.nextInt();
                    if (levelOfTree[kPathQuery[j]] > maxDepthOfTree) {
                        maxDepthOfTree = levelOfTree[kPathQuery[j]];
                        nodeWithMaxDepthOfTree = kPathQuery[j];
                    }
                }

                boolean isPathPossible = process(nodeWithMaxDepthOfTree,
                        parentOfTree, levelOfTree, kPathQuery, visitedPaths, i);
                System.out.println(isPathPossible ? "YES" : "NO");
            }
        }
        scanner.close();
    }

    private static void addEdgeOnTree(Map<Integer, Set<Integer>> tree,
                                      Integer u, Integer v) {
        if (!tree.containsKey(u)) tree.put(u, new HashSet<>());
        tree.get(u).add(v);
    }

    private static void addPathForQuery(Map<Integer, Set<Integer>> tree, Integer u, Integer v) {
        addEdgeOnTree(tree, u, v);
        addEdgeOnTree(tree, v, u);
    }

    private static void traverseTillParent(int nodeWithMaxDepth, int[] parent, int[] visited, int marker) {
        visited[nodeWithMaxDepth] = marker;
        while (parent[nodeWithMaxDepth] != -1) {
            nodeWithMaxDepth = parent[nodeWithMaxDepth];
            visited[nodeWithMaxDepth] = marker;
        }
    }

    private static boolean process(int nodeWithMaxDepth, int[] parent, int[] level, int[] query, int[] visited, int marker) {
        traverseTillParent(nodeWithMaxDepth, parent, visited, marker);
        int maxDepth = 0;
        nodeWithMaxDepth = -1;
        for (int q : query) {
            if (visited[q] != marker && level[q] > maxDepth) {
                maxDepth = level[q];
                nodeWithMaxDepth = q;
            }
        }

        if (nodeWithMaxDepth == -1) return true;

        while (visited[nodeWithMaxDepth] != marker) {
            visited[nodeWithMaxDepth] = marker;
            nodeWithMaxDepth = parent[nodeWithMaxDepth];
        }

        for (int q : query) {
            if (visited[q] != marker || level[q] < level[nodeWithMaxDepth]) return false;

        }
        return true;
    }

    private static void preProcess(Map<Integer, Set<Integer>> tree, int[] level, int[] parent) {
        boolean[] visited = new boolean[level.length];
        Queue<Integer> bfsQueue = new LinkedList<>();
        int u = 1;
        parent[u] = -1;
        level[u] = 0;
        bfsQueue.add(u);
        visited[u] = true;
        while (!bfsQueue.isEmpty()) {
            int n = bfsQueue.size();
            while (n-- > 0) {
                int parentNode = bfsQueue.poll();
                Set<Integer> children = tree.get(parentNode);
                for (Integer child : children) {
                    if (!visited[child]) {
                        parent[child] = parentNode;
                        level[child] = level[parentNode] + 1;
                        visited[child] = true;
                        bfsQueue.add(child);
                    }
                }
            }
        }
    }
}