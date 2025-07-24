package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B19 {
    static int norZone;
    static int colZone;
    static char[][] board ;
    static boolean[][] visited ;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int n;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        norZone=0;
        colZone=0;
        board=new char[n+1][n+1];
        visited=new boolean[n+1][n+1];

        for(int i = 0;i<n;i++){
            String line = br.readLine();
            for(int j=0;j<n;j++){
                board[i][j]=line.charAt(j);
            }
        }

        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                if(!visited[i][j]){
                    dfs(i,j,board[i][j],false);
                    norZone++;
                }
            }
        }

        visited = new boolean[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
        if (!visited[i][j]) {
            dfs(i, j, board[i][j],true);
            colZone++;
            }
        }
    }
    System.out.println(norZone+" "+colZone);
    }

    static public void dfs(int x,int y,char c,boolean colorBlind){
        visited[x][y]=true;
        for(int i = 0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if(visited[nx][ny]) continue;
            char next = board[nx][ny];

            if (colorBlind) {
                if ((c == 'R' || c == 'G') && (next == 'R' || next == 'G')) {
                    dfs(nx, ny, next, colorBlind);
                } else if (c == 'B' && next == 'B') {
                    dfs(nx, ny, next, colorBlind);
                }
            } else {
                if (c == next) {
                    dfs(nx, ny, next,colorBlind);
                }
            }
        }
    }
}
