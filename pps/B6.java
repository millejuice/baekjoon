package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class B6 {
    public static boolean[] visited;
    public static int[][] arr_dfs;
    public static String answer_dfs = "";
    public static String answer_bfs = "";
    public static boolean[] check;
    public static Deque<Integer> deque;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] words = s.split(" ");
        int n = Integer.parseInt(words[0]);
        int m = Integer.parseInt(words[1]);
        int v = Integer.parseInt(words[2]);


        arr_dfs=new int[n+1][n+1];
        visited=new boolean[n+1];
        check = new boolean[n+1];
        deque=new LinkedList<>();

        // dfs
        for(int i = 0;i<m;i++){
            String line = br.readLine();
            String[] lines=line.split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);
            arr_dfs[a][b] = arr_dfs[b][a] = 1;
        }
        dfs(v, arr_dfs);
        System.out.println(answer_dfs.trim());
        bfs(v, n);
        System.out.println(answer_bfs.trim());
    }

    public static void dfs(int node,int[][] graph){
        visited[node] = true;
        answer_dfs += node + " ";
        for(int i = 1; i<graph.length;i++){
            if(arr_dfs[node][i]==1 && !visited[i]){
                dfs(i, graph);
            }
        }
    }

    public static void bfs(int start,int n){
        check[start]=true;
        deque.add(start);
        while(!deque.isEmpty()){
            start = deque.poll();
            answer_bfs+=start + " ";
            for(int i = 1;i<=n;i++){
                if(arr_dfs[start][i]==1 && !check[i]){
                    deque.add(i);
                    check[i]=true;
                }
            }
        }
    }
}
