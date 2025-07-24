package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B49 {
    static List<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            graph[a].add(b);
            graph[b].add(a);
        }
        parent=new int[n+1];
        visited=new boolean[n+1];

        dfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int now){
        visited[now]=true;
        for(int next : graph[now]){
            if(!visited[next]){
                parent[next] = now;
                dfs(next);
            }
        }
    }
}
