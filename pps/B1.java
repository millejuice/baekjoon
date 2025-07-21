package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1 {
    public static int[][]node;
    public static boolean[] visited;
    public static int result=0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n_com = Integer.parseInt(br.readLine());
        int pairs = Integer.parseInt(br.readLine());

        node = new int[n_com+1][n_com+1];
        visited=new boolean[n_com+1];

        for(int i=0;i<pairs;i++){
            String[] parts = br.readLine().split(" ");
            int m = Integer.parseInt(parts[0]);
            int n = Integer.parseInt(parts[1]);

            node[m][n]=node[n][m]=1;
        }
        dfs(1, n_com);
        System.out.println(result-1);
    }

    public static void dfs(int n,int n_com){
        visited[n]=true;
        result+=1;
        for(int i = 1;i<=n_com;i++){
            if(node[n][i]==1 && !visited[i]==true){
                dfs(i,n_com);
            }
        }
    }
}
