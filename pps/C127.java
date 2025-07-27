package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class C127 {
    static int[][] chessBoard;
    static int startX,startY,endX,endY;
    static int[] dx={1,2,2,1,-1,-2,-2,-1};
    static int[] dy={2,1,-1,-2,-2,-1,1,2};
    static boolean[][] visited;
    static int answer;
    static int I;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            answer=0;
            I = Integer.parseInt(br.readLine());
            chessBoard= new int[I+1][I+1];
            visited=new boolean[I+1][I+1];
            for(int a = 0; a<=I;a++){
                for(int b = 0; b<=I;b++){
                    visited[a][b]=false;
                }
            }
            String[] sIn = br.readLine().split(" ");
            String[] eIn = br.readLine().split(" ");
            startX=Integer.parseInt(sIn[0]);
            startY=Integer.parseInt(sIn[1]);
            endX=Integer.parseInt(eIn[0]);
            endY=Integer.parseInt(eIn[1]);
            answer=bfs(startX, startY, endX, endY);
            System.out.println(answer);
        }
    }

    static int bfs(int x,int y,int ex,int ey){
        visited[x][y]=true;
        Deque<int[]> deque = new LinkedList<>();
        deque.offer(new int[]{x,y,0});
        while(!deque.isEmpty()){
            int[] curr = deque.poll();
            int sx=curr[0];
            int sy=curr[1];
            int depth=curr[2];
            for(int i=0;i<8;i++){
                int nx = sx+dx[i];
                int ny=sy+dy[i];
                if(nx>=0 && ny>=0 && nx<I && ny<I){
                    if(!visited[nx][ny]){
                        if(nx==ex && ny==ey) return depth+1;
                        deque.offer(new int[]{nx,ny,depth+1});
                        visited[nx][ny]=true;
                    }
                }
            }
        }
        return 0;
    }
}
