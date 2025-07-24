package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B14 {
    static int[][] map;
    static boolean[][] visited;
    // 12시, 1시,3시,5시,6시,7시,9시,10시 방향 순서
    static int[] dx={0,1,1,1,0,-1,-1,-1};
    static int[] dy={1,1,0,-1,-1,-1,0,1};
    static int answer;
    static int w;
    static int h;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            answer=0;
            String[] narr = br.readLine().split(" ");
            w = Integer.parseInt(narr[0]);
            h = Integer.parseInt(narr[1]);
            if(w==0 && h==0) break;
            map=new int[h+1][w+1];
            visited=new boolean[h+1][w+1];
            for(int i = 0; i<h;i++){
                String in = br.readLine();
                String ins[]=in.split(" ");
                for(int j=0;j<w;j++){
                    map[i][j]=Integer.parseInt(ins[j]);
                }
            }
            for(int i = 0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]==1 && !visited[i][j]){
                        dfs(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }

    }

    static void dfs(int x,int y){
        visited[x][y]=true;
        for(int i = 0;i<8;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && ny>=0 && nx<h && ny<w){
                if(!visited[nx][ny] && map[nx][ny]==1){
                    dfs(nx, ny);
                }
            }
        }
    }
}
