package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class B15 {
    public static int[] check;
    public static boolean[] visited;
    public static Deque<Integer> deque;
    public static int answer;
    public static int[] dir={-1,1};
    static int n;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] words = s.split(" ");
        deque=new LinkedList<>();
        answer=0;
        check= new int[n+1];
        visited= new boolean[n+1];

        for(int i = 0;i<n;i++){
            check[i]=Integer.parseInt(words[i]);
        }
        int start = Integer.parseInt(br.readLine())-1;
        bfs(start);
        System.out.println(answer);
    }

    public static void bfs(int start){
        visited[start]=true;
        deque.offer(start);
        answer++;
        while(!deque.isEmpty()){
            int curr = deque.poll();
            for(int i = 0;i<2;i++){
                int next = curr+(dir[i]*check[curr]);
                if(next<0 || next>=n) continue;
                if(visited[next]) continue;
                deque.offer(next);
                visited[next] = true;
                answer++;
            }
        }
    }
}
