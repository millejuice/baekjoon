package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B20 {
    static int[][] board = new int[6][6];
    static Set<String> set = new HashSet<>();
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 1; i <= 5; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 1; j <= 5; j++) {
            board[i][j] = Integer.parseInt(st.nextToken());
        }
    }

    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 5; j++) {
            dfs(i, j, 1, String.valueOf(board[i][j]));
        }
    }
    System.out.println(set.size());
    }

    static public void dfs(int x,int y,int depth,String path){
        if(depth==6){
            set.add(path);
            return ;
        }
        for(int dir = 0; dir<4;dir++){
            int nx = x+dx[dir];
            int ny = y+dy[dir];
            if(nx>0 && nx<=5 && ny>0 && ny<=5){
                dfs(nx, ny, depth+1, path+board[nx][ny]);
            }
        }
    }
}
