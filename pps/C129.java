package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class C129 {
    static int[] dx={0,0,-1,1};
    static int[] dy={1,-1,0,0};
    static int[][] box;
    static int M,N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] size = br.readLine().split(" ");
        M = Integer.parseInt(size[0]);
        N = Integer.parseInt(size[1]);
        int maximum=-2;

        box = new int[N+1][M+1];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(line[j]);
            }
        }
        bfs();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(box[i][j]==0){
                    System.out.println(-1);
                    return ;
                }
                maximum = Math.max(maximum, box[i][j]);
            }
        }
        System.out.println(maximum-1);
    }

    public static void bfs(){
        // 익지 않은 토마토 0, 익은 토마토 1, 토마토 없으면 -1
        Deque<int[]> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    deque.offer(new int[]{i, j});
                }
            }
        }
        while(!deque.isEmpty()){
            int[] curr = deque.poll();
            int curX = curr[0];
            int curY = curr[1];
            for(int i=0;i<4;i++){
                int nx = curX+dx[i];
                int ny=curY+dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<M){
                    if(box[nx][ny]==0){
                        box[nx][ny]=box[curX][curY]+1;
                        deque.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}

