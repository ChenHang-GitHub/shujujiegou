package shujujiegou.graph;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 图的实现，广度优先，深度优先*/
public class Graph {

    List<String> vertexList;
    int[][] edges;
    int numOfEdge;
    boolean[] isVisited;

    public Graph(int n) {
        vertexList = new ArrayList<>(n);
        edges = new int[n][n];
        isVisited = new boolean[n];
        numOfEdge = 0;
    }

    public void insert(String vertex) {
        vertexList.add(vertex);
    }

    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdge++;
    }

    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    public void showGraph() {
        for (String v : vertexList
                ) {
            System.out.print(v + " ");
        }
    }


    public int getFirstNext(int index) {

        for (int i = 0; i < edges.length; i++) {
            if (edges[index][i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public int getNextNext(int i, int w) {
        for (int j = w + 1; j < edges.length; j++) {
            if (edges[i][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    public void dfs() {
        isVisited = new boolean[vertexList.size()];
        for (int i = 0; i < numOfEdge; i++) {
            if (!isVisited[i]) {
                dfs(isVisited, i);
            }
        }

    }

    public void bfs() {
        isVisited = new boolean[vertexList.size()];
        for (int i = 0; i < numOfEdge; i++) {
            if (!isVisited[i]) {
                bfs(isVisited, i);
            }
        }

    }

    private void bfs(boolean[] isVisited, int i) {
        int u;
        int w;
        LinkedList queue = new LinkedList();
        System.out.print(vertexList.get(i) + " ");
        queue.addLast(i);
        isVisited[i] = true;

        while (queue != null) {
            u = (int)queue.removeFirst();
            w = getFirstNext(u);
            while (w != -1) {
                if (!isVisited[w]) {
                    System.out.print(vertexList.get(w) + " ");
                    isVisited[w] = true;
                    queue.addLast(w);
                }
                w= getNextNext(u,w);
            }
        }
    }


    private void dfs(boolean[] isVisited, int i) {
        System.out.print(getValue(i) + " ");
        isVisited[i] = true;
        int w = getFirstNext(i);
        while (w != -1) {
            if (!isVisited[w]) {
                dfs(isVisited, w);
            }
            w = getNextNext(i, w);
        }
    }

    private String getValue(int i) {
        return vertexList.get(i);
    }


    public static void main(String[] args) {
        int n = 5;  //结点的个数
        String Vertexs[] = {"A", "B", "C", "D", "E"};
        Graph graph = new Graph(n);

        for (String v : Vertexs
                ) {
            graph.insert(v);
        }

        graph.insertEdge(0, 1, 1); // A-B
        graph.insertEdge(0, 2, 1); //
        graph.insertEdge(1, 2, 1); //
        graph.insertEdge(1, 3, 1); //
        graph.insertEdge(1, 4, 1); //

//        graph.showGraph();
        graph.dfs();

    }

}
