package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A113 {
    static List<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        int answer=0;
        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
            visited[i]=false;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u); 
        }

        for(int i = 1;i<=N;i++){
            if(!visited[i]){
                answer++;
                dfs(i);
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int node){
        visited[node]=true;
        for(int next:graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
        
    }
}
