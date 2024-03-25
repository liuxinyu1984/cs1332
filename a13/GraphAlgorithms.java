package a13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * Your implementation of various graph traversal algorithms.
 */
public class GraphAlgorithms {

    /**
     * Performs a breadth first search (bfs) on the input graph, starting at
     * the parameterized starting vertex.
     *
     * When exploring a vertex, explore in the order of neighbors returned by
     * the adjacency list. Failure to do so may cause you to lose points.
     *
     * You may import/use java.util.Set, java.util.List, java.util.Queue, and
     * any classes that implement the aforementioned interfaces, as long as they
     * are efficient.
     *
     * The only instance of java.util.Map that you should use is the adjacency
     * list from graph. DO NOT create new instances of Map for BFS
     * (storing the adjacency list in a variable is fine).
     *
     * DO NOT modify the structure of the graph. The graph should be unmodified
     * after this method terminates.
     *
     * You may assume that the passed in start vertex and graph will not be null.
     * You may assume that the start vertex exists in the graph.
     *
     * @param <T>   The generic typing of the data.
     * @param start The vertex to begin the bfs on.
     * @param graph The graph to search through.
     * @return List of vertices in visited order.
     */
    public static <T> List<Vertex<T>> bfs(Vertex<T> start, Graph<T> graph) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> visitedSet = new HashSet<>();
        List<Vertex<T>> traverse = new ArrayList<>();
        visitedSet.add(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            Vertex<T> v = queue.remove();
            traverse.add(v);
            for (VertexDistance<T> vd : graph.getAdjList().get(v)) {
                Vertex<T> w = vd.getVertex();
                if (!visitedSet.contains(w)) {
                    visitedSet.add(w);
                    queue.add(w);
                }
            }
        }
        return traverse;
    }

    /**
     * Performs a depth first search (dfs) on the input graph, starting at
     * the parameterized starting vertex.
     *
     * When exploring a vertex, explore in the order of neighbors returned by
     * the adjacency list. Failure to do so may cause you to lose points.
     *
     * NOTE: This method should be implemented recursively. You may need to
     * create a helper method.
     *
     * You may import/use java.util.Set, java.util.List, and any classes that
     * implement the aforementioned interfaces, as long as they are efficient.
     *
     * The only instance of java.util.Map that you may use is the adjacency list
     * from graph. DO NOT create new instances of Map for DFS
     * (storing the adjacency list in a variable is fine).
     *
     * DO NOT modify the structure of the graph. The graph should be unmodified
     * after this method terminates.
     *
     * You may assume that the passed in start vertex and graph will not be null.
     * You may assume that the start vertex exists in the graph.
     *
     * @param <T>   The generic typing of the data.
     * @param start The vertex to begin the dfs on.
     * @param graph The graph to search through.
     * @return List of vertices in visited order.
     */
    public static <T> List<Vertex<T>> dfs(Vertex<T> start, Graph<T> graph) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        Set<Vertex<T>> visitedSet = new HashSet<>();
        List<Vertex<T>> traverse = new ArrayList<>();
        dfsHelper(start, graph, visitedSet, traverse);
        return traverse;
    }

    private static <T> void dfsHelper(Vertex<T> u, Graph<T> graph, Set<Vertex<T>> visitedSet,
            List<Vertex<T>> traverse) {
        // base case
        visitedSet.add(u);
        traverse.add(u);
        for (VertexDistance<T> vd : graph.getAdjList().get(u)) {
            Vertex<T> w = vd.getVertex();
            if (!visitedSet.contains(w)) {
                dfsHelper(w, graph, visitedSet, traverse);
            }
        }
    }

    public static <T> List<Vertex<T>> dfsNonRecursive(Vertex<T> start, Graph<T> graph) {
        Set<Vertex<T>> visitedSet = new HashSet<>();
        List<Vertex<T>> traverse = new ArrayList<>();
        Stack<Vertex<T>> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            Vertex<T> v = stack.pop();
            if (!visitedSet.contains(v)) {
                visitedSet.add(v);
                traverse.add(v);
                for (VertexDistance<T> vd : graph.getAdjList().get(v)) {
                    Vertex<T> w = vd.getVertex();
                    if (!visitedSet.contains(w)) {
                        stack.push(w);
                    }
                }
            }
        }
        return traverse;
    }

    public static <T> Map<Vertex<T>, Integer> dijkstra(Vertex<T> start, Graph<T> graph) {
        PriorityQueue<VertexDistance<T>> pq = new PriorityQueue<>();
        Map<Vertex<T>, Integer> distanceMap = new HashMap<>();
        Set<Vertex<T>> visitedSet = new LinkedHashSet<>();

        // fill the distance map with initial values = infinity
        for (Vertex<T> v : graph.getVertices()) {
            distanceMap.put(v, Integer.MAX_VALUE);
        }
        distanceMap.put(start, 0);

        pq.add(new VertexDistance<>(start, 0));

        while (!pq.isEmpty() && visitedSet.size() < graph.getVertices().size()) {
            VertexDistance<T> vd = pq.poll();
            Vertex<T> u = vd.getVertex();
            int d = vd.getDistance();
            if (!visitedSet.contains(u)) {
                // add to visitedSet
                visitedSet.add(u);
                // update distanceMap
                if (d < distanceMap.get(u)) {
                    distanceMap.put(u, d);
                }
                // enqueue all adjacent vertices to priority queue
                for (VertexDistance<T> vd2 : graph.getAdjList().get(u)) {
                    Vertex<T> w = vd2.getVertex();
                    int d2 = vd2.getDistance();
                    pq.add(new VertexDistance<>(w, d + d2));
                }
            }
        }

        System.out.println(visitedSet);
        return distanceMap;
    }
}