package a13;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class testGraphAlgorithms {

    public static Graph<Character> testUndirectedGraphChar() {
        // create HashSet of vertices
        char[] listOfVertices = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        LinkedHashSet<Vertex<Character>> vertices = new LinkedHashSet<>();
        for (char c : listOfVertices) {
            vertices.add(new Vertex<Character>(c));
        }
        // System.out.println(vertices);

        LinkedHashSet<Edge<Character>> edges = new LinkedHashSet<>();
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('A'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('G'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('A'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('G'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('A'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('F'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('H'), 0));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('G'), 0));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('H'), 0));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('G'), 0));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('H'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('E'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('F'), 0));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('E'), 0));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('F'), 0));
        // System.out.println(edges);
        return new Graph<Character>(vertices, edges);
    }

    public static void testDFS() {
        Graph<Character> graph = testUndirectedGraphChar();
        List<Vertex<Character>> dfsTraverse = GraphAlgorithms.dfs(new Vertex<Character>('G'), graph);
        System.out.println(dfsTraverse);
    }

    public static void testDFSNonRecursive() {
        Graph<Character> graph = testUndirectedGraphChar();
        List<Vertex<Character>> dfsTraverse = GraphAlgorithms.dfsNonRecursive(new Vertex<Character>('G'), graph);
        System.out.println(dfsTraverse);
    }

    public static void testBFS() {
        char[] listOfVertices = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        LinkedHashSet<Vertex<Character>> vertices = new LinkedHashSet<>();
        for (char c : listOfVertices) {
            vertices.add(new Vertex<Character>(c));
        }

        LinkedHashSet<Edge<Character>> edges = new LinkedHashSet<>();
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('E'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('G'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('A'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('E'), 0));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('F'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('A'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('F'), 0));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('H'), 0));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('A'), 0));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('H'), 0));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('G'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('B'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('F'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('H'), 0));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('D'), 0));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('E'), 0));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('G'), 0));

        Graph<Character> graph = new Graph<>(vertices, edges);
        List<Vertex<Character>> bfsTraverse = GraphAlgorithms.bfs(new Vertex<Character>('C'), graph);
        System.out.println(bfsTraverse);
    }

    public static void testDijkstra() {
        char[] listOfVertices = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        LinkedHashSet<Vertex<Character>> vertices = new LinkedHashSet<>();
        for (char c : listOfVertices) {
            vertices.add(new Vertex<Character>(c));
        }

        LinkedHashSet<Edge<Character>> edges = new LinkedHashSet<>();
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('B'), 6));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('C'), 2));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('D'), 3));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('E'), 5));

        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('A'), 6));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('C'), 7));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('D'), 9));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('F'), 8));

        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('A'), 2));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('B'), 7));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('E'), 6));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('F'), 8));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('G'), 2));

        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('A'), 3));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('B'), 9));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('F'), 2));

        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('A'), 5));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('C'), 6));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('H'), 2));

        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('B'), 8));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('C'), 8));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('D'), 2));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('G'), 1));

        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('C'), 2));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('F'), 1));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('H'), 2));

        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('E'), 2));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('G'), 2));

        Graph<Character> graph = new Graph<>(vertices, edges);
        Map<Vertex<Character>, Integer> distanceMap = GraphAlgorithms.dijkstra(new Vertex<Character>('E'), graph);
        System.out.println(distanceMap);
    }

    public static void testDijkstraPracticeExam() {
        char[] listOfVertices = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
        LinkedHashSet<Vertex<Character>> vertices = new LinkedHashSet<>();
        for (char c : listOfVertices) {
            vertices.add(new Vertex<Character>(c));
        }

        LinkedHashSet<Edge<Character>> edges = new LinkedHashSet<>();
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('B'), 4));
        edges.add(new Edge<>(new Vertex<>('A'), new Vertex<>('G'), 3));

        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('A'), 4));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('C'), 2));
        edges.add(new Edge<>(new Vertex<>('B'), new Vertex<>('H'), 4));

        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('B'), 2));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('D'), 7));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('E'), 8));
        edges.add(new Edge<>(new Vertex<>('C'), new Vertex<>('G'), 0));

        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('C'), 7));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('E'), 5));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('F'), 6));
        edges.add(new Edge<>(new Vertex<>('D'), new Vertex<>('H'), 1));

        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('C'), 8));
        edges.add(new Edge<>(new Vertex<>('E'), new Vertex<>('D'), 5));

        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('D'), 6));
        edges.add(new Edge<>(new Vertex<>('F'), new Vertex<>('G'), 7));

        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('A'), 3));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('C'), 0));
        edges.add(new Edge<>(new Vertex<>('G'), new Vertex<>('F'), 7));

        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('B'), 4));
        edges.add(new Edge<>(new Vertex<>('H'), new Vertex<>('D'), 1));

        Graph<Character> graph = new Graph<>(vertices, edges);
        Map<Vertex<Character>, Integer> distanceMap = GraphAlgorithms.dijkstra(new Vertex<Character>('A'), graph);
        System.out.println(distanceMap);
    }

    public static void main(String[] args) {
        // testDFS();
        // testDFSNonRecursive();
        // testBFS();
        // testDijkstra();
        testDijkstraPracticeExam();
    }
}
