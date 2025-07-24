package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class C114 {
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy={1,-1,0,0};
    static int answer;
    static int n,m;

    public static void main(String[] args) throws IOException {
        // (1,1) -> (n,m) 시작점 포함 = 시작값 = 1
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] nm= br.readLine().split(" ");   
    n = Integer.parseInt(nm[0]);
    m = Integer.parseInt(nm[1]);
    miro = new int[n+1][m+1];
    visited = new boolean[n+1][m+1];
    answer=1;

    for(int i = 1; i<=n;i++){
        for(int j=1;j<=m;j++){
            miro[i][j] = 0;
        }
    }
    for(int i =1;i<=n;i++){
        for(int j=1;j<=m;j++){
            visited[i][j]=false;
        }
    }
    bfs(1,1);
    System.out.println(miro[n][m]);
    }
    static void bfs(int x,int y){
        Deque<int[]> deque = new LinkedList<>();
        visited[x][y]=true;
        deque.offer(new int[]{x,y});
        while(!deque.isEmpty()){
            int[] curr = deque.poll();
            int sx = curr[0];
            int sy = curr[1];
            for(int i=1;i<=4;i++){
                int nx = sx + dx[i];
                int ny = sy + dy[i];
                if(nx>0 && ny>0 && nx<=n && ny<=m){
                    if(!visited[nx][ny] && miro[nx][ny]==1){
                        deque.offer(new int[]{nx,ny});
                        visited[nx][ny]=true;
                        miro[nx][ny]=miro[sx][sy]+1;
                    }
                }
            }
        }
    }
}
