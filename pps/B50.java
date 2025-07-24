package pps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class B50 {
    static int V;
    static ArrayList<Node>[] graph;
    static int answer;
    static boolean[]visited;
    static int maximum;
    static class Node {
        int to, weight;
        Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        answer=0;
        maximum=0;

        graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;
                int weight = Integer.parseInt(st.nextToken());
                graph[from].add(new Node(to, weight));
            }
        }

        // 이후 로직에서 graph를 사용해서 트리의 지름 계산
        // 1번 노드에서 제일 먼 노드 찾기
        visited=new boolean[V+1];
        

        //  가장 먼 노드에서 DFS해서 지름 찾기

    }

    public static void dfs(int start,int len){

    }

}

