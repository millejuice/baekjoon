package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D9 {
    static int n;
    static int[][] forest;
    static int [][] dp;
    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        forest = new int[n][n];
        dp=new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                forest[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j]=0;
            }
        }


        // dfs실행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dfs(i, j);
            }
        }
        // dp에 있는 값중 최댓값이 answer
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer=Math.max(answer, dp[i][j]);
            }
        }

        System.out.println(answer); 
    }

    static int dfs(int x,int y){
        if(dp[x][y]!=0) return dp[x][y];
        dp[x][y] = 1;
        // dx, dy계산 후 dx,dy가 정상 범위이고, visited가 false일때
        for(int i = 0;i<4;i++){
            int nx = x+dx[i];
            int ny = y + dy[i];
            // 정상 범위 & 대나무가 더 많아야 움직일수 있음 
            if(nx>=0 && ny>=0 && nx<n && ny<n && forest[nx][ny]>forest[x][y]){
                // memorization이 되지 않은 곳이라면 
                dp[x][y]=Math.max(dp[x][y], dfs(nx, ny)+1);
            }
        }
        return dp[x][y];
    }
}
