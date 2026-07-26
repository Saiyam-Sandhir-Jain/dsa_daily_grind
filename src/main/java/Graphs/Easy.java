package main.java.Graphs;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Easy {
    public static List<Integer> bfsTraversal(int n, int[][] E, int initialNode) {
        List<Integer> bfsList = new ArrayList<>();

        if (initialNode >= n)
            return bfsList;

        Queue<Integer> traversalQueue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        traversalQueue.offer(initialNode);
        visited[initialNode] = true;
        while (!traversalQueue.isEmpty()) {
            int currNode = traversalQueue.poll();
            for (int node : E[currNode]) {
                if (!visited[node]) {
                    traversalQueue.offer(node);
                    visited[node] = true;
                } 
            } bfsList.add(currNode);
        }

        return bfsList;
    }

    public static List<Integer> dfsTraversal(int n, int[][] E, int initialNode) {
        List<Integer> dfsList = new ArrayList<>();

        if (initialNode >= n)
            return dfsList;

        Deque<Integer> dfsStack = new ArrayDeque<>();
        boolean[] visited = new boolean[n];

        dfsStack.push(initialNode);
        visited[initialNode] = true;

        while (!dfsStack.isEmpty()) {
            int currNode = dfsStack.pop();
            dfsList.add(currNode);

            for (int node : E[currNode]) {
                if (!visited[node]) {
                    visited[node] = true;
                    dfsStack.push(node);
                }
            }
        }

        return dfsList;
    }

    public static int countConnectedComponents(int n, int[][] E) {
        return 1;
    }
}
